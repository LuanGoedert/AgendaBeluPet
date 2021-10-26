package com.example.agendabelupet.modules

import androidx.room.Room
import com.example.agendabelupet.database.AppDataBase
import com.example.agendabelupet.database.FireBaseDb
import com.example.agendabelupet.interfaces.ItemRepository
import com.example.agendabelupet.repository.ItemRepositoryImpl
import com.example.agendabelupet.repository.UserRepositoryImpl
import com.example.agendabelupet.ui.agenda.AgendaViewModel
import com.example.agendabelupet.ui.collected.CollectedItemsViewModel
import com.example.agendabelupet.ui.dogList.DogListViewModel
import com.example.agendabelupet.ui.login.LoginViewModel
import com.example.agendabelupet.ui.newPlan.NewPlanViewModel
import com.example.agendabelupet.ui.profit.ProfitViewModel
import com.example.agendabelupet.ui.settings.SettingsViewModel
import com.example.agendabelupet.utils.WeekDaysString
import com.google.firebase.firestore.FirebaseFirestore
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module
import java.lang.Exception

//val appModule = (uiAgendaModule + domainAgendaModule + dataAgendaModule)

val appModule = module {

    single {
        Room.databaseBuilder(androidApplication(), AppDataBase::class.java, "AppDataBase")
            .build()
    }
    single { get<AppDataBase>().itemDao() }

    single { get<AppDataBase>().userDao() }


    factory {
        ItemRepositoryImpl(
            itemDao = get()
        )
    }

    factory {
        UserRepositoryImpl(
            userDao = get()
        )
    }

    factory {
        WeekDaysString()
    }

    viewModel {
        LoginViewModel(
            application = androidApplication(),
            userRepositoryImpl = get()
        )
    }

    viewModel {
        SettingsViewModel(
            application = androidApplication(),
            userRepositoryImpl = get(),
            itemRepositoryImpl = get(),
            db = FirebaseFirestore.getInstance()
        )
    }

    viewModel {
        AgendaViewModel(
            application = androidApplication(),
            userRepositoryImpl = get(),
            itemRepositoryImpl = get(),
            items = get()
        )
    }

    viewModel {
        NewPlanViewModel(
            application = androidApplication(),
            itemRepositoryImpl = get(),
            userRepositoryImpl = get(),
            fireBaseDb = FirebaseFirestore.getInstance()
        )
    }

    viewModel {
        DogListViewModel(
            application = androidApplication(),
            itemRepositoryImpl = get(),
            fireBaseDb = FirebaseFirestore.getInstance(),
            userRepositoryImpl = get()
        )
    }

    viewModel {
        CollectedItemsViewModel(
            application = androidApplication(),
            itemRepositoryImpl = get(),
            userRepositoryImpl = get(),
            fireBaseDb = FirebaseFirestore.getInstance()
        )
    }

    viewModel {
        ProfitViewModel(
            application = androidApplication(),
            itemRepositoryImpl = get()
        )
    }
}