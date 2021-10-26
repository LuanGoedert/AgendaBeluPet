package com.example.agendabelupet.utils

import com.example.agendabelupet.enums.WeekDaysEnums
import com.example.agendabelupet.models.entities.WeekDaysModel

class WeekDaysString {

    fun loadWeekDays(): List<String> {
        return mutableListOf(
            "Segunda",
            "Terça",
            "Quarta",
            "Quinta",
            "Sexta",
            "Sábado"
        )
    }
}