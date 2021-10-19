package com.example.agendabelupet.ui.agenda

import android.app.Application
import android.content.Context
import android.widget.ArrayAdapter
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.agendabelupet.R
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.repository.ItemRepositoryImpl
import com.example.agendabelupet.repository.UserRepositoryImpl
import com.example.agendabelupet.utils.WeekDaysString
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

class AgendaViewModel(
    application: Application,
    private val itemRepositoryImpl: ItemRepositoryImpl,
    private val userRepositoryImpl: UserRepositoryImpl,
    private val items: WeekDaysString
) : AndroidViewModel(application) {

    val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())

    private var _itensFromDb = MutableLiveData<List<ItemEntity>>()
    var itensFromDb: LiveData<List<ItemEntity>> = _itensFromDb

    val mDayOfWeek = MutableLiveData<Int>()
    val dayOfWeek: LiveData<Int>
        get() {
            return mDayOfWeek
        }


    val mLoadingScreen = MutableLiveData<Boolean>()
    val loadingScreen: LiveData<Boolean>
        get() {
            return mLoadingScreen
        }

    val mAdapter = MutableLiveData<ArrayAdapter<Any>>()

    fun initAdapter(context: Context) = viewModelScope.launch {
        mAdapter.value = ArrayAdapter(context, R.layout.list_item, items.loadWeekDays())
    }

    fun initLoading() = viewModelScope.launch {
        mLoadingScreen.value = true
    }

    fun stopLoading() = viewModelScope.launch {
        mLoadingScreen.value = false
    }

    fun setAdapter(context: Context, block: () -> Unit) = viewModelScope.launch {
        block()
        initAdapter(context)
    }

    fun getActualDay(): Int {
        when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
            Calendar.MONDAY -> {
                return R.string.text_segunda
            }
            Calendar.TUESDAY -> {
                return R.string.text_ter_a
            }
            Calendar.WEDNESDAY -> {
                return R.string.text_quarta
            }
            Calendar.THURSDAY -> {
                return R.string.text_quinta
            }
            Calendar.FRIDAY -> {
                return R.string.text_sexta
            }
            Calendar.SATURDAY -> {
                return R.string.text_s_bado
            }
            else -> {
                return R.string.text_day_no_concat
            }
        }

    }

    suspend fun getDogsFromDatabase(weekDay: String) = viewModelScope.launch {
        initLoading()
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
        stopLoading()
    }
}