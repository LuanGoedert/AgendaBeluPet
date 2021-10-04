package com.example.agendabelupet.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.agendabelupet.dao.ItemDao
import com.example.agendabelupet.dao.UserDao
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.models.entities.UserEntity
import com.example.agendabelupet.utils.DateToTimestampConverter
import com.google.firebase.firestore.auth.User

@Database(
    entities = [
        ItemEntity::class,
        UserEntity::class
    ],version = 1,
    exportSchema = false
)
@TypeConverters(DateToTimestampConverter::class)
abstract class AppDataBase: RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun itemDao(): ItemDao
}

