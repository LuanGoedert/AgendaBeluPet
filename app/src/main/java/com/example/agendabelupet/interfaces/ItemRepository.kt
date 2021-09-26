package com.example.agendabelupet.interfaces

import com.example.agendabelupet.models.entities.ItemEntity

interface ItemRepository {
    suspend fun insert(item: ItemEntity)
    suspend fun update(item: ItemEntity)
    suspend fun delete(item: ItemEntity)
    suspend fun updateToCollected(id: Int)
    suspend fun updateToNotCollected(id: Int)

    suspend fun getItemsNotCollectedByweekDay(itemDay: String): List<ItemEntity>
    suspend fun getItemsCollected(): List<ItemEntity>
}