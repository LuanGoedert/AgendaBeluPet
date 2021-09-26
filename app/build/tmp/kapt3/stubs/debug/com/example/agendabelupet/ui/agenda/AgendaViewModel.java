package com.example.agendabelupet.ui.agenda;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u001dR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\f8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/example/agendabelupet/ui/agenda/AgendaViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "itemRepositoryImpl", "Lcom/example/agendabelupet/repository/ItemRepositoryImpl;", "(Landroid/app/Application;Lcom/example/agendabelupet/repository/ItemRepositoryImpl;)V", "_itensFromDb", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/agendabelupet/models/entities/ItemEntity;", "itensFromDb", "Landroidx/lifecycle/LiveData;", "getItensFromDb", "()Landroidx/lifecycle/LiveData;", "setItensFromDb", "(Landroidx/lifecycle/LiveData;)V", "loadingScreen", "", "getLoadingScreen", "mLoadingScreen", "getMLoadingScreen", "()Landroidx/lifecycle/MutableLiveData;", "mWeekDay", "", "getMWeekDay", "weekDay", "getWeekDay", "getDogsFromDatabase", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initLoading", "stopLoading", "app_debug"})
public final class AgendaViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mWeekDay = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> _itensFromDb;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> itensFromDb;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mLoadingScreen = null;
    private final com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMWeekDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getWeekDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> getItensFromDb() {
        return null;
    }
    
    public final void setItensFromDb(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMLoadingScreen() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingScreen() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDogsFromDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String weekDay, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job initLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job stopLoading() {
        return null;
    }
    
    public AgendaViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl) {
        super(null);
    }
}