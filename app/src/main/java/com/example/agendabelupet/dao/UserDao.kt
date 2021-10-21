package com.example.agendabelupet.dao

import androidx.room.*
import com.example.agendabelupet.models.entities.UserEntity

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: UserEntity)

    @Update
    suspend fun updateUser(user: UserEntity)

    @Delete
    suspend fun deleteUser(user: UserEntity)

    @Query("DELETE FROM UserEntity")
    suspend fun deleteAllUsers()

    @Query("SELECT * FROM UserEntity ")
    suspend fun getUser(): UserEntity
}