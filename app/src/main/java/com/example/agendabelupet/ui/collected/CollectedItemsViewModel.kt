package com.example.agendabelupet.ui.collected

import android.app.Application
import androidx.lifecycle.*
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.repository.ItemRepositoryImpl
import kotlinx.coroutines.launch
import java.util.*

class CollectedItemsViewModel(
    application: Application,
    private val itemRepositoryImpl: ItemRepositoryImpl
) : AndroidViewModel(application) {
    val _listItemsCollected = MutableLiveData<List<ItemEntity>>()
    val listItemsCollected: LiveData<List<ItemEntity>>
        get() {
            return _listItemsCollected
        }


        fun getListItemsCollected(type: String) = viewModelScope.launch {
            type.toLowerCase()
            if (type == "todos") {
                itemRepositoryImpl.getAllItems().also {
                    _listItemsCollected.postValue(it)
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

        }

    }