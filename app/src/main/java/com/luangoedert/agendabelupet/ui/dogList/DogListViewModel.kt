package com.example.agendabelupet.ui.dogList

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.agendabelupet.database.FireBaseDb
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.repository.ItemRepositoryImpl
import com.example.agendabelupet.repository.UserRepositoryImpl
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class DogListViewModel(
    application: Application,
    private val fireBaseDb: FirebaseFirestore,
    private val itemRepositoryImpl: ItemRepositoryImpl,
    private val userRepositoryImpl: UserRepositoryImpl
) : FireBaseDb(
    application, fireBaseDb, itemRepositoryImpl
) {

    private val mLoadingProgressBar = MutableLiveData(false)
    val loadingProgressBar: LiveData<Boolean>
        get() {
            return mLoadingProgressBar
        }

    val succesOnDelete :LiveData<Boolean>
    get(){
        return successOnDeleteItemFromFireBase
    }

    val sdf = SimpleDateFormat("dd/MM/yyyy")

    suspend fun getItemFromRepoById(id: Int): ItemEntity {
        return itemRepositoryImpl.getItemById(id)
    }

    suspend fun updateItem(itemEntity: ItemEntity, ownerName: String, phone: String) {
        updateDocument(userRepositoryImpl.getUser().userEmail, ownerName, phone, itemEntity)
    }

    fun deleteLoosePlan(itemEntity: ItemEntity) = viewModelScope.launch {
        deleteDocument(userRepositoryImpl.getUser().userEmail, itemEntity.ownerName, itemEntity.phone)
        itemRepositoryImpl.deleteItemById(itemEntity.id)
    }

    fun initLoading() = viewModelScope.launch {
        mLoadingProgressBar.value = true
    }

    fun stopLoading() = viewModelScope.launch {
        mLoadingProgressBar.value = false
    }


    suspend fun markItemAsCollected(itemEntity: ItemEntity, dataQuinzenal: String) =
        viewModelScope.launch {
            if (dataQuinzenal.isNotEmpty()) {
                val date = sdf.parse(dataQuinzenal)
                val c = Calendar.getInstance()
                c.time = date
                c.add(Calendar.DATE, 14)
                val newDate = sdf.format(c.time)
                viewModelScope.launch {
                    itemRepositoryImpl.updateDataQuinzenal(newDate,  itemEntity.id)
                    itemRepositoryImpl.updateToCollected(itemEntity.id)
                    val itemToUpdate = itemEntity
                    itemToUpdate.collected = true
                    updateItem( itemToUpdate, itemEntity.ownerName, itemEntity.phone)
                }
            } else {
                itemRepositoryImpl.updateToCollected(itemEntity.id)
                updateItem( itemEntity, itemEntity.ownerName, itemEntity.phone)
            }

        }

    suspend fun markItemAsNotCollected(itemEntity : ItemEntity) = viewModelScope.launch {
        itemRepositoryImpl.updateToNotCollected(itemEntity.id)
        val itemToUpdate = itemEntity
        itemToUpdate.collected = false
        updateItem( itemEntity, itemEntity.ownerName, itemEntity.phone)
    }

}