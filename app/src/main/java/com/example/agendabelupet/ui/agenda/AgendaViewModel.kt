package com.example.agendabelupet.ui.agenda

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.repository.ItemRepositoryImpl
import com.example.agendabelupet.repository.UserRepositoryImpl
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

class AgendaViewModel(
    application: Application,
    private val itemRepositoryImpl: ItemRepositoryImpl,
    private val userRepositoryImpl: UserRepositoryImpl
) : AndroidViewModel(application) {

    val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())

    val mWeekDay = MutableLiveData<String>("")
    val weekDay: LiveData<String>
        get() {
            return mWeekDay
        }

    private var _itensFromDb = MutableLiveData<List<ItemEntity>>()
    var itensFromDb: LiveData<List<ItemEntity>> = _itensFromDb

    val mLoadingScreen = MutableLiveData<Boolean>()
    val loadingScreen: LiveData<Boolean>
        get() {
            return mLoadingScreen
        }


    suspend fun getDogsFromDatabase(weekDay: String) = viewModelScope.launch {
        itemRepositoryImpl.getItemsNotCollectedByweekDay(weekDay).also { list ->
            var listaItens: MutableList<ItemEntity> = mutableListOf()
            listaItens = list.toMutableList()
            val listaToRemove = mutableListOf<ItemEntity>()
            listaItens.forEach { item ->
                if (item.dataQuinzenal.isNotEmpty()) {
                    val diateste = sdf.parse(item.dataQuinzenal)
                    val diff = System.currentTimeMillis() - diateste.time
                    val diffDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)
                    if (diffDays.toInt() != 15 || diffDays.toInt() != 0) {
                        listaToRemove.add(item)
                    } else {
                        item.dataQuinzenal = sdf.format(Calendar.getInstance().time)
                        itemRepositoryImpl.updateDataQuinzenal(item.dataQuinzenal, item.id)
                    }
                }
            }
            listaItens.remove(listaToRemove)
            _itensFromDb.value = listaItens
        }
    }

    fun initLoading() = viewModelScope.launch {
        mLoadingScreen.value = true
    }

    fun stopLoading() = viewModelScope.launch {
        mLoadingScreen.value = false
    }


}