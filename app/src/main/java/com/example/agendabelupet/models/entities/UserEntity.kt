package com.example.agendabelupet.models.entities

import android.net.Uri
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "UserEntity")
data class UserEntity (
    @PrimaryKey(autoGenerate = true)
    var userId : Int = 0,
    var userName : String = "",
    var userEmail : String = "",
    var userPhotoUri : String = ""
): Serializable