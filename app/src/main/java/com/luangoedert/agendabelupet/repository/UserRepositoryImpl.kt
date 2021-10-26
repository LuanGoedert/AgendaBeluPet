package com.example.agendabelupet.repository

import com.example.agendabelupet.dao.UserDao
import com.example.agendabelupet.interfaces.UserRepository
import com.example.agendabelupet.models.entities.UserEntity

class UserRepositoryImpl(private val userDao: UserDao):UserRepository {
    override suspend fun insertUser(user: UserEntity) {
        return userDao.insertUser(user)
    }

    override suspend fun updateUser(user: UserEntity) {
        return userDao.updateUser(user)
    }

    override suspend fun deleteUser(user: UserEntity) {
        return userDao.deleteUser(user)
    }

    override suspend fun deleteAllUsers() {
        userDao.deleteAllUsers()
    }

    override suspend fun getUser(): UserEntity {
        return userDao.getUser()
    }

}