package com.example.agendabelupet.utils

import com.example.agendabelupet.enums.WeekDaysEnums
import com.example.agendabelupet.models.entities.WeekDaysModel

class WeekDays {
    fun loadWeekDays(): MutableList<WeekDaysModel> {
        return mutableListOf(
            WeekDaysModel(WeekDaysEnums.SEGUNDA),
            WeekDaysModel(WeekDaysEnums.TERCA),
            WeekDaysModel(WeekDaysEnums.QUARTA),
            WeekDaysModel(WeekDaysEnums.QUINTA),
            WeekDaysModel(WeekDaysEnums.SEXTA),
            WeekDaysModel(WeekDaysEnums.SABADO),
        )
    }
}