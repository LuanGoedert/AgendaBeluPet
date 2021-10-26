package com.example.agendabelupet.utils

import androidx.room.TypeConverter
import java.util.*

/**
 * Date time Converters
 */
object DateToTimestampConverter {
    @TypeConverter
    @JvmStatic
    fun dateFromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    @JvmStatic
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }
}