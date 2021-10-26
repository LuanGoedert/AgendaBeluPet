package com.example.agendabelupet

import android.app.Application
import com.example.agendabelupet.dao.ItemDao
import com.example.agendabelupet.database.AppDataBase
import com.example.agendabelupet.modules.appModule
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@MainApplication)
            modules(appModule)
        }
    }
}