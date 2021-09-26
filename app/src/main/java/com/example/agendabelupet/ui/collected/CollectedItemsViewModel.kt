package com.example.agendabelupet.ui.collected

import android.app.Application
import androidx.lifecycle.*
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.repository.ItemRepositoryImpl
import kotlinx.coroutines.launch

class CollectedItemsViewModel(application: Application,private val  itemRepositoryImpl: ItemRepositoryImpl) : AndroidViewModel(application) {

    val _listItemsCollected = MutableLiveData<List<ItemEntity>>()
    val listItemsCollected : LiveData<List<ItemEntity>>
        get() {
            return _listItemsCollected
        }

    fun getListItemsCollected() = viewModelScope.launch{
        itemRepositoryImpl.getItemsCollected().also {
            _listItemsCollected.postValue(it)
        }
    }

}