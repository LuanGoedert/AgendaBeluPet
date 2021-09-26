package com.example.agendabelupet.ui.dogList

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.agendabelupet.repository.ItemRepositoryImpl
import kotlinx.coroutines.launch

class DogListViewModel(application: Application,private val  itemRepositoryImpl: ItemRepositoryImpl) : AndroidViewModel(application) {


    suspend fun markItemAsCollected(itemID: Int) = viewModelScope.launch {
        itemRepositoryImpl.updateToCollected(itemID)
    }
}