package com.example.agendabelupet.ui.newPlan

import android.app.Application
import android.content.ContentValues
import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.os.Environment
import android.provider.MediaStore
import androidx.lifecycle.*
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.repository.ItemRepositoryImpl
import kotlinx.coroutines.launch
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream

class NewPlanViewModel(application: Application, private val itemRepositoryImpl: ItemRepositoryImpl) : AndroidViewModel(application) {

    val isbiweekly = MutableLiveData(false)

    val _isItemSaved = MutableLiveData<Boolean>()
    val isItemSaved : LiveData<Boolean>
    get() {
        return _isItemSaved
    }


    suspend fun saveDog(itemEntity: ItemEntity) {
        viewModelScope.launch { itemRepositoryImpl.insert(itemEntity)}.invokeOnCompletion {
            _isItemSaved.postValue(true)
        }
    }

}