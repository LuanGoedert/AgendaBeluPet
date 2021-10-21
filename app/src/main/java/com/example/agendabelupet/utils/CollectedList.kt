package com.example.agendabelupet.utils

class CollectedList {
    fun getOptionsCollected(): List<String>{
        return mutableListOf(
           "Todos",
           "Coletados",
           "Não Coletados"
        )
    }
}