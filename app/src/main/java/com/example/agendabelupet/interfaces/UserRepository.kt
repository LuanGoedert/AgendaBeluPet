package com.example.agendabelupet.interfaces

import com.example.agendabelupet.models.entities.UserEntity

interface UserRepository {
    suspend fun insertUser(user: UserEntity)
    suspend fun updateUser(user: UserEntity)
    suspend fun deleteUser(user: UserEntity)

    suspend fun deleteAllUsers()

    suspend fun getUser(): UserEntity

}