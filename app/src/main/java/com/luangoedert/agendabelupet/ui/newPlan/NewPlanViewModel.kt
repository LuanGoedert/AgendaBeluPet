package com.example.agendabelupet.ui.newPlan

import android.app.Application
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.*
import com.example.agendabelupet.database.FireBaseDb
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.repository.ItemRepositoryImpl
import com.example.agendabelupet.repository.UserRepositoryImpl
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.launch

class NewPlanViewModel(
    application: Application,
    private val itemRepositoryImpl: ItemRepositoryImpl,
    private val userRepositoryImpl: UserRepositoryImpl,
    private val fireBaseDb: FirebaseFirestore
) : FireBaseDb(application, fireBaseDb, itemRepositoryImpl) {
    val isbiweekly = MutableLiveData(false)

    val dayOfWeek = MutableLiveData<Int>()

    val wrongDaySet = MutableLiveData<Boolean>()

    val _isItemSaved = MutableLiveData<Boolean>()
    val isItemSaved: LiveData<Boolean>
        get() {
            return _isItemSaved
        }


    suspend fun saveDog(itemEntity: ItemEntity, context: Context) {
        viewModelScope.launch { itemRepositoryImpl.insert(itemEntity) }.invokeOnCompletion {
            _isItemSaved.postValue(true)
        }.also {
            insertDocument(
                userEmail = userRepositoryImpl.getUser().userEmail,
                ownerName = itemEntity.ownerName,
                phone = itemEntity.phone,
                itemEntity = itemEntity,
            )
        }
    }

    fun updateDog(context: Context, itemEntity: ItemEntity) = viewModelScope.launch {
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

        updateDocument(
            userEmail = userRepositoryImpl.getUser().userEmail,
            ownerName = itemEntity.ownerName,
            phone = itemEntity.phone,
            itemEntity = itemEntity
        )
    }.invokeOnCompletion {
        _isItemSaved.postValue(true)
    }
}