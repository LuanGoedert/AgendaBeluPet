package com.example.agendabelupet.database

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.repository.ItemRepositoryImpl
import com.example.agendabelupet.utils.fireBaseDb
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch

abstract class FireBaseDb(
    application: Application,
    private val db: FirebaseFirestore,
    private val repositoryImpl: ItemRepositoryImpl
) : AndroidViewModel(application) {

    private var auth: FirebaseAuth = Firebase.auth


    protected val successOnGetItemFromFireBase = MutableLiveData<Boolean>()

    protected val successOnDeleteAccountFireBase = MutableLiveData<Boolean>()

    fun insertDocument(
        userEmail: String,
        ownerName: String,
        phone: String,
        itemEntity: ItemEntity
    ) {
        db.collection(userEmail).document("$ownerName - $phone")
            .set(itemEntity)
    }

    fun updateDocument(
        userEmail: String,
        ownerName: String,
        phone: String,
        itemEntity: ItemEntity
    ) {
        db.collection(userEmail).document("$ownerName - $phone").delete()
            .addOnSuccessListener {
                db.collection(userEmail).document("$ownerName - $phone")
                    .set(itemEntity)
            }
    }

    protected fun getuserDocument(userEmail: String, showMessage: Boolean) = viewModelScope.launch {
        try {
            db.collection(userEmail).get().addOnCompleteListener {
                if (it.isSuccessful) {
                    for (lala in it.result.documents) {
                        val item = ItemEntity(
                            ownerName = lala["ownerName"].toString(),
                            phone = lala["phone"].toString(),
                            name = lala["name"].toString(),
                            race = lala["race"].toString(),
                            weekDay = lala["weekDay"].toString(),
                            planType = lala["planType"].toString(),
                            value = lala["value"].toString().toInt(),
                            district = lala["district"].toString(),
                            street = lala["street"].toString(),
                            houseNumber = lala["houseNumber"].toString(),
                            collected = lala["collected"] as Boolean,
                            dataQuinzenal = lala["dataQuinzenal"].toString()
                        )
                        viewModelScope.launch { repositoryImpl.insert(item) }
                    }
                }
            }.addOnSuccessListener {
                if (showMessage) {
                    successOnGetItemFromFireBase.value = true
                }
            }.addOnFailureListener {
                if (showMessage) {
                    successOnGetItemFromFireBase.value = false
                }
            }
        } catch (ex: Exception) {
            Log.e("tag", ex.message.toString())
        }
    }

    fun logOut() {
        auth.signOut()
    }

    fun deleteUserAccount(userEmail: String) = viewModelScope.launch {
        getuserDocument(userEmail, showMessage = false).invokeOnCompletion {
            viewModelScope.launch {
                repositoryImpl.getAllItems().also { it ->
                    it.forEach {
                        db.collection(userEmail).document(it.ownerName + " - " + it.phone).delete()
                            .addOnSuccessListener {
                                successOnDeleteAccountFireBase.value = true
                            }.addOnFailureListener {
                                successOnDeleteAccountFireBase.value = false
                            }
                    }
                }
            }
        }
    }
}