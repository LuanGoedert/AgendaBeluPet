package com.example.agendabelupet.repository

import com.example.agendabelupet.dao.ItemDao
import com.example.agendabelupet.interfaces.ItemRepository
import com.example.agendabelupet.models.entities.ItemEntity

class ItemRepositoryImpl (private val itemDao: ItemDao): ItemRepository {

    override suspend fun insert(item: ItemEntity) {
        itemDao.insert(item)
    }

    override suspend fun update(item: ItemEntity) {
        itemDao.update(item)
    }

    override suspend fun delete(item: ItemEntity) {
        itemDao.delete(item)
    }

    override suspend fun updateToCollected(id: Int) {
        itemDao.updateToCollected(id)
    }

    override suspend fun updateToNotCollected(id: Int) {
        itemDao.updateToNotCollected(id)
    }


    override suspend fun getItemsNotCollectedByweekDay(itemDay: String): List<ItemEntity> {
        return itemDao.getItemsNotCollectedByWeekDay(itemDay)
    }

    override suspend fun getItemsCollected(): List<ItemEntity> {
        return itemDao.getItemsCollected()
    }

    override suspend fun getAllItems(): List<ItemEntity> {
        return itemDao.getAllItems()
    }

    override suspend fun getItemsNotCollected(): List<ItemEntity> {
        return itemDao.getItemsNotCollected()
    }
}