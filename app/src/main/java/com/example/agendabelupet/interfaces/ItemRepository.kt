package com.example.agendabelupet.interfaces

import android.content.ClipData
import com.example.agendabelupet.models.entities.ItemEntity

interface ItemRepository {
    suspend fun insert(item: ItemEntity)
    suspend fun update(item: ItemEntity)
    suspend fun updateItemById(id : Int, ownername: String, name: String, race: String, weekDay: String,plan: String, value: String, phone: String, district: String, street: String, houseNumber: String, collected: Boolean, dataQuinzenal: String)
    suspend fun delete(item: ItemEntity)
    suspend fun deleteAllDb()
    suspend fun deleteItemById(id:Int)
    suspend fun updateToCollected(id: Int)
    suspend fun updateToNotCollected(id: Int)
    suspend fun getItemsNotCollectedByweekDay(itemDay: String): List<ItemEntity>
    suspend fun getItemsCollected(): List<ItemEntity>
    suspend fun getAllItems(): List<ItemEntity>
    suspend fun getItemsNotCollected(): List<ItemEntity>
    suspend fun getValues(): List<Int>
    suspend fun updateDataQuinzenal(dataQuinzenal: String, id: Int)
    suspend fun getValuesQuinzenal(): List<Int>
    suspend fun getValuesSemanal(): List<Int>
    suspend fun getItemById(id:Int): ItemEntity
    suspend fun setItemsCollected(collected: Boolean)
}