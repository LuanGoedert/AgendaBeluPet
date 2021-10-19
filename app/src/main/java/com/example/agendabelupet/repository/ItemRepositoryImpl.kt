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

    override suspend fun updateItemById(
        id: Int,
        ownername: String,
        name: String,
        race: String,
        weekDay: String,
        plan: String,
        value: String,
        phone: String,
        district: String,
        street: String,
        houseNumber: String,
        collected: Boolean,
        dataQuinzenal: String
    ) {
        return itemDao.updateItemById(id, ownername, name, race, weekDay, plan, value, phone, district, street, houseNumber, collected, dataQuinzenal)
    }

    override suspend fun updateDateBiWeekly(newDate: String, id: Int) {
        return itemDao.updateDateBiWeekly(newDate, id)
    }

    override suspend fun delete(item: ItemEntity) {
        itemDao.delete(item)
    }

    override suspend fun deleteAllDb() {
        itemDao.deleteAllDb()
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

    override suspend fun deleteItemById(id:Int) {
        return itemDao.deleteItemById(id)
    }

    override suspend fun getItemsNotCollected(): List<ItemEntity> {
        return itemDao.getItemsNotCollected()
    }

    override suspend fun getValues(): List<Int> {
        return itemDao.getValues()
    }

    override suspend fun updateDataQuinzenal(dataQuinzenal: String, id: Int) {
        return itemDao.updateDataQuinzenal(dataQuinzenal, id)
    }

    override suspend fun getItemById(id: Int):ItemEntity {
        return itemDao.getItemById(id)
    }
}