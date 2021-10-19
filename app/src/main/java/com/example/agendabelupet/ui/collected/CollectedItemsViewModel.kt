package com.example.agendabelupet.ui.collected

import android.app.Application
import androidx.lifecycle.*
import com.example.agendabelupet.database.FireBaseDb
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.models.entities.UserEntity
import com.example.agendabelupet.repository.ItemRepositoryImpl
import com.example.agendabelupet.repository.UserRepositoryImpl
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.auth.User
import kotlinx.coroutines.launch

class CollectedItemsViewModel(
    application: Application,
    private val itemRepositoryImpl: ItemRepositoryImpl,
    private val userRepositoryImpl: UserRepositoryImpl,
    private val fireBaseDb: FirebaseFirestore,
) : FireBaseDb(application, fireBaseDb, itemRepositoryImpl) {
    val user = MutableLiveData<UserEntity>()

    val _listItemsCollected = MutableLiveData<List<ItemEntity>>()
    val listItemsCollected: LiveData<List<ItemEntity>>
        get() {
            return _listItemsCollected
        }

    private val mLoadingProgressBar = MutableLiveData(false)
    val loadingProgressBar: LiveData<Boolean>
        get() {
            return mLoadingProgressBar
        }

    init {
       viewModelScope.launch {  user.value = userRepositoryImpl.getUser() }
    }

    fun getListItemsCollected(type: String) = viewModelScope.launch {
        type.toLowerCase()
        if (type == "todos") {
            itemRepositoryImpl.getAllItems().also {
                _listItemsCollected.postValue(it)
                _listItemsCollected.value?.sortedBy { it.weekDay }
            }
        } else if (type == "coletados") {
            itemRepositoryImpl.getItemsCollected().also {
                _listItemsCollected.postValue(it)
            }
        } else {
            itemRepositoryImpl.getItemsNotCollected().also {
                _listItemsCollected.postValue(it)
            }
        }
        _listItemsCollected.value?.sortedBy { it.weekDay }
    }

    fun saveItems(itemsList: List<ItemEntity>) = viewModelScope.launch {
        itemsList.forEach { item ->
            itemRepositoryImpl.insert(item)
        }
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

    fun deleteAllDb() = viewModelScope.launch{
        itemRepositoryImpl.deleteAllDb()
    }


}