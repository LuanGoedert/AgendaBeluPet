package com.example.agendabelupet.ui.profit

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.agendabelupet.repository.ItemRepositoryImpl
import com.github.mikephil.charting.data.PieEntry
import kotlinx.coroutines.launch

class ProfitViewModel(
    application: Application,
    private val itemRepositoryImpl: ItemRepositoryImpl
) : AndroidViewModel(application) {

    private val mValueSemanal = MutableLiveData<Int>(0)
    val valueSemanal: LiveData<Int>
        get() {
            return mValueSemanal

        }

    private val mValueQUinzenal = MutableLiveData<Int>(0)
    val valueQuinzenal: LiveData<Int>
        get() {
            return mValueQUinzenal

        }

    private val mValor = MutableLiveData<Boolean>(false)
    val valor: LiveData<Boolean>
        get() {
            return mValor

        }

    val listaFinal = MutableLiveData<MutableList<PieEntry>>(mutableListOf())

    init {
        viewModelScope.launch {
            getAllValues().invokeOnCompletion {
                       mValor.value  =true
            }
        }
    }

    suspend fun getAllValues() = viewModelScope.launch {
        val listaSemanal = itemRepositoryImpl.getValuesSemanal()
        val listaQuinzenal = itemRepositoryImpl.getValuesQuinzenal()

        listaSemanal.forEach {
            mValueSemanal.value = mValueSemanal.value?.plus(it)
        }
        listaQuinzenal.forEach {
            mValueQUinzenal.value = mValueQUinzenal.value?.plus(it)
        }
        listaFinal.value?.add(PieEntry(valueQuinzenal.value!!.toFloat(), "Quinzenal"))
        listaFinal.value?.add(PieEntry(valueSemanal.value!!.toFloat(), "Semanal"))
    }
}