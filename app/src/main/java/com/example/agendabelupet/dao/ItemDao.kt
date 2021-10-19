package com.example.agendabelupet.dao


import android.content.ClipData
import androidx.room.*
import com.example.agendabelupet.models.entities.ItemEntity

@Dao
interface ItemDao {
    @Insert
    suspend fun insert(item: ItemEntity)

    @Update
    suspend fun update(item: ItemEntity)

    @Query("UPDATE ItemEntity  SET ownerName = :ownername, name = :name, race = :race,weekDay = :weekDay,planType = :planType, value = :value, phone = :phone, district = :district, street = :street, houseNumber = :houseNumber, collected = :collected, dataQuinzenal = :dataQuinzenal  WHERE id = :id")
    suspend fun updateItemById(id : Int, ownername: String, name: String, race: String, weekDay: String,planType: String, value: String, phone: String, district: String, street: String, houseNumber: String, collected: Boolean, dataQuinzenal: String)

    @Query("UPDATE ItemEntity SET dataQuinzenal = :dataQuinzenal WHERE Id = :id")
    suspend fun updateDataQuinzenal(dataQuinzenal: String, id: Int)

    @Delete
    suspend fun delete(item: ItemEntity)

    @Query("UPDATE ItemEntity SET collected = 1 WHERE id =:id")
    suspend fun updateToCollected(id: Int)

    @Query("UPDATE ItemEntity SET collected = 0 WHERE id =:id")
    suspend fun updateToNotCollected(id: Int)


    @Query("SELECT * FROM ItemEntity WHERE weekDay = :weekDay AND collected = 0")
    suspend fun getItemsNotCollectedByWeekDay(weekDay:String): List<ItemEntity>

    @Query("SELECT * FROM ItemEntity")
    suspend fun getAllItems(): List<ItemEntity>

    @Query("SELECT * FROM ItemEntity WHERE  collected = 0")
    suspend fun getItemsNotCollected(): List<ItemEntity>

    @Query("SELECT * FROM ItemEntity WHERE  collected = 1")
    suspend fun getItemsCollected(): List<ItemEntity>

    @Query("SELECT value FROM ItemEntity")
    suspend fun getValues(): List<Int>

    @Query("DELETE FROM ItemEntity WHERE id =:id")
    suspend fun deleteItemById(id: Int)
}