package com.example.agendabelupet.ui.profit

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.agendabelupet.repository.ItemRepositoryImpl
import kotlinx.coroutines.launch

class ProfitViewModel(application: Application,private val itemRepositoryImpl: ItemRepositoryImpl) : AndroidViewModel(application) {

    private val mValue = MutableLiveData<Int>(0)
    val value : LiveData<Int>
        get(){
            return mValue

        }
    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text

    init {
        viewModelScope.launch { getAllValues()  }
    }

    suspend fun getAllValues()= viewModelScope.launch {
        val listoFInts = itemRepositoryImpl.getValues()
        listoFInts.forEach{
            mValue.value = mValue.value?.plus(it)
        }

    }

}