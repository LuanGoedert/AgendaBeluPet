package com.example.agendabelupet.ui.newPlan

import android.app.Application
import androidx.lifecycle.*
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.repository.ItemRepositoryImpl
import kotlinx.coroutines.launch

class NewPlanViewModel(
    application: Application,
    private val itemRepositoryImpl: ItemRepositoryImpl
) : AndroidViewModel(application) {

    val isbiweekly = MutableLiveData(false)

    val _isItemSaved = MutableLiveData<Boolean>()
    val isItemSaved: LiveData<Boolean>
        get() {
            return _isItemSaved
        }


    suspend fun saveDog(itemEntity: ItemEntity) {
        viewModelScope.launch { itemRepositoryImpl.insert(itemEntity) }.invokeOnCompletion {
            _isItemSaved.postValue(true)
        }
    }

    fun updateDog(itemEntity: ItemEntity) =
        viewModelScope.launch {
            itemRepositoryImpl.updateItemById(
                itemEntity.id,
                itemEntity.ownerName,
                itemEntity.name,
                itemEntity.race,
                itemEntity.weekDay,
                itemEntity.planType,
                itemEntity.value.toString(),
                itemEntity.phone,
                itemEntity.district,
                itemEntity.street,
                itemEntity.houseNumber,
                itemEntity.collected,
                itemEntity.dataQuinzenal
            )
        }.invokeOnCompletion {
            _isItemSaved.postValue(true)
        }


}