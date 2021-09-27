package com.example.agendabelupet.models.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.agendabelupet.enums.WeekDaysEnums
import java.io.Serializable

@Entity(tableName = "ItemEntity")
data class ItemEntity (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var ownerName : String  = "",
    var name: String = "",
    var race : String = "",
    var weekDay: String = "",
    var plan : String = "",
    var value: Int = 0,
    var phone : String = "",
    var district: String  = "",
    var street : String = "",
    var houseNumer : String = "",
    var collected: Boolean = false,
    var dataQuinzenal : String = ""
    ): Serializable