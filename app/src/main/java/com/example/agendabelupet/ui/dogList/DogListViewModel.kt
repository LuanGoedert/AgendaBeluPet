package com.example.agendabelupet.ui.dogList

import android.app.Application
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

    val sdf = SimpleDateFormat("dd/MM/yyyy")

    suspend fun getItemFromRepoById(id: Int): ItemEntity {
        return itemRepositoryImpl.getItemById(id)
    }

    suspend fun updateToCollected(itemEntity: ItemEntity, ownerName: String, phone: String) {
        updateDocument(userRepositoryImpl.getUser().userEmail, ownerName, phone, itemEntity)
    }

    suspend fun deleteLoosePlan(id: Int) = viewModelScope.launch {
        itemRepositoryImpl.deleteItemById(id)
    }

    suspend fun updateBiWeeklyPlan(newDate: String, id: Int) {
        itemRepositoryImpl.updateDateBiWeekly(newDate, id)
    }

    suspend fun markItemAsCollected(itemEntity: ItemEntity, dataQuinzenal: String) = viewModelScope.launch {
        if (dataQuinzenal.isNotEmpty()) {
            itemRepositoryImpl.deleteItemById(itemEntity.id)
            val date = sdf.parse(dataQuinzenal)
            val c = Calendar.getInstance()
            c.time = date
            c.add(Calendar.DATE, 14)
            val newDate = sdf.format(c.time)
            itemEntity.dataQuinzenal = newDate
            itemEntity.collected = true
            itemRepositoryImpl.insert(itemEntity)
        } else {
            itemRepositoryImpl.updateToCollected(itemEntity.id)
        }

    }

    suspend fun markItemAsNotCollected(itemID: Int) = viewModelScope.launch {
        itemRepositoryImpl.updateToNotCollected(itemID)
    }
}