package com.example.agendabelupet.ui.agenda

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.repository.ItemRepositoryImpl
import kotlinx.coroutines.launch
import java.util.*

class AgendaViewModel(
    application: Application,
    private val itemRepositoryImpl: ItemRepositoryImpl
) : AndroidViewModel(application) {

    val mWeekDay = MutableLiveData<String>("")
    val weekDay: LiveData<String>
        get() {
            return mWeekDay
        }

    private var _itensFromDb = MutableLiveData<List<ItemEntity>>()
    var itensFromDb: LiveData<List<ItemEntity>> = _itensFromDb

    val mLoadingScreen = MutableLiveData<Boolean>()
    val loadingScreen : LiveData<Boolean>
        get() {
            return mLoadingScreen
        }


    suspend fun getDogsFromDatabase(weekDay: String) = viewModelScope.launch {
        itemRepositoryImpl.getItemsNotCollectedByweekDay(weekDay).also {
            _itensFromDb.value = it
        }
    }

    fun initLoading() = viewModelScope.launch{
        mLoadingScreen.value = true
    }

    fun stopLoading()= viewModelScope.launch{
        mLoadingScreen.value = false
    }


}