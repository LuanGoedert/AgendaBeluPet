package com.example.agendabelupet.ui.settings

import android.app.Activity
import android.app.Application
import androidx.lifecycle.*
import com.example.agendabelupet.database.FireBaseDb
import com.example.agendabelupet.models.entities.UserEntity
import com.example.agendabelupet.repository.ItemRepositoryImpl
import com.example.agendabelupet.repository.UserRepositoryImpl
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.launch

class SettingsViewModel(
    application: Application,
    private val db: FirebaseFirestore,
    private val userRepositoryImpl: UserRepositoryImpl,
    private val itemRepositoryImpl: ItemRepositoryImpl
) : FireBaseDb(application, db, itemRepositoryImpl) {
    val user = MutableLiveData<UserEntity>()

    private val mLoadingProgressBar = MutableLiveData(false)
    val loadingProgressBar: LiveData<Boolean>
        get() {
            return mLoadingProgressBar
        }

    val showSuccesOnGetDb: LiveData<Boolean>
        get() {
            return successOnGetItemFromFireBase
        }

    val showSuccesOndeleteAccount :LiveData<Boolean>
    get(){
        return successOnDeleteAccountFireBase
    }

    init {
        viewModelScope.launch { user.value = userRepositoryImpl.getUser() }
    }

    fun getItemsFirebase(userEmail: String) = viewModelScope.launch {
        getuserDocument(userEmail, true).invokeOnCompletion {
            viewModelScope.launch {
                stopLoading()
            }
        }
    }

    fun initLoading() = viewModelScope.launch {
        mLoadingProgressBar.value = true
    }

    fun stopLoading() = viewModelScope.launch {
        mLoadingProgressBar.value = false
    }


    fun deleteAllDb(deleteUserDbEither: Boolean) = viewModelScope.launch {
        if (deleteUserDbEither) {
            userRepositoryImpl.deleteAllUsers()
        }
        itemRepositoryImpl.deleteAllDb()
    }

    fun deleteUSerAccount() {
        deleteUserAccount(user.value!!.userEmail).invokeOnCompletion {
            deleteAllDb(true)
        }
    }

    fun closeApp(activity: Activity) {
        logOut()
        activity.finishAndRemoveTask()
    }
}