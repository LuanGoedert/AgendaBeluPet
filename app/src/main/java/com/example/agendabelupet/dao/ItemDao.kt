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

    @Delete
    suspend fun delete(item: ItemEntity)

    @Query("UPDATE ItemEntity SET collected = 1 WHERE id =:id")
    suspend fun updateToCollected(id: Int)

    @Query("UPDATE ItemEntity SET collected = 0 WHERE id =:id")
    suspend fun updateToNotCollected(id: Int)


    @Query("SELECT * FROM ItemEntity WHERE weekDay = :weekDay AND collected = 0")
    suspend fun getItemsNotCollectedByWeekDay(weekDay:String): List<ItemEntity>

    @Query("SELECT * FROM ItemEntity WHERE  collected = 1")
    suspend fun getItemsCollected(): List<ItemEntity>

    @Query("DELETE FROM ItemEntity WHERE id =:id")
    suspend fun deleteItemById(id: String)
}