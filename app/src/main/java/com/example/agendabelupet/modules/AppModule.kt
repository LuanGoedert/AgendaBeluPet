package com.example.agendabelupet.modules

import androidx.room.Room
import com.example.agendabelupet.database.AppDataBase
import com.example.agendabelupet.interfaces.ItemRepository
import com.example.agendabelupet.repository.ItemRepositoryImpl
import com.example.agendabelupet.ui.agenda.AgendaViewModel
import com.example.agendabelupet.ui.collected.CollectedItemsViewModel
import com.example.agendabelupet.ui.dogList.DogListViewModel
import com.example.agendabelupet.ui.newPlan.NewPlanViewModel
import com.example.agendabelupet.ui.profit.ProfitViewModel
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


    factory {
        ItemRepositoryImpl(
            itemDao = get()
        )
    }

    viewModel {
        AgendaViewModel(
            application = androidApplication(),
            itemRepositoryImpl = get()
        )
    }

    viewModel {
        NewPlanViewModel(
            application = androidApplication(),
            itemRepositoryImpl = get()
        )
    }

    viewModel {
        DogListViewModel(
            application = androidApplication(),
            itemRepositoryImpl = get()
        )
    }

    viewModel {
        CollectedItemsViewModel(
            application = androidApplication(),
            itemRepositoryImpl = get()
        )
    }

    viewModel {
        ProfitViewModel(
            application = androidApplication()
        )
    }
}