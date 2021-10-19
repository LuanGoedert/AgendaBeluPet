package com.example.agendabelupet.ui.agenda;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010(\u001a\u00020\u0011J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020*J\u001c\u00102\u001a\u00020*2\u0006\u0010/\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u00020504J\u0006\u00106\u001a\u00020*R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010$\u001a\u00020%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"Lcom/example/agendabelupet/ui/agenda/AgendaViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "itemRepositoryImpl", "Lcom/example/agendabelupet/repository/ItemRepositoryImpl;", "userRepositoryImpl", "Lcom/example/agendabelupet/repository/UserRepositoryImpl;", "items", "Lcom/example/agendabelupet/utils/WeekDaysString;", "(Landroid/app/Application;Lcom/example/agendabelupet/repository/ItemRepositoryImpl;Lcom/example/agendabelupet/repository/UserRepositoryImpl;Lcom/example/agendabelupet/utils/WeekDaysString;)V", "_itensFromDb", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/agendabelupet/models/entities/ItemEntity;", "dayOfWeek", "Landroidx/lifecycle/LiveData;", "", "getDayOfWeek", "()Landroidx/lifecycle/LiveData;", "itensFromDb", "getItensFromDb", "setItensFromDb", "(Landroidx/lifecycle/LiveData;)V", "loadingScreen", "", "getLoadingScreen", "mAdapter", "Landroid/widget/ArrayAdapter;", "", "getMAdapter", "()Landroidx/lifecycle/MutableLiveData;", "mDayOfWeek", "getMDayOfWeek", "mLoadingScreen", "getMLoadingScreen", "sdf", "Ljava/text/SimpleDateFormat;", "getSdf", "()Ljava/text/SimpleDateFormat;", "getActualDay", "getDogsFromDatabase", "Lkotlinx/coroutines/Job;", "weekDay", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initAdapter", "context", "Landroid/content/Context;", "initLoading", "setAdapter", "block", "Lkotlin/Function0;", "", "stopLoading", "app_debug"})
public final class AgendaViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.text.SimpleDateFormat sdf = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> _itensFromDb;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> itensFromDb;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> mDayOfWeek = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mLoadingScreen = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<android.widget.ArrayAdapter<java.lang.Object>> mAdapter = null;
    private final com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl = null;
    private final com.example.agendabelupet.repository.UserRepositoryImpl userRepositoryImpl = null;
    private final com.example.agendabelupet.utils.WeekDaysString items = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getSdf() {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMDayOfWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getDayOfWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMLoadingScreen() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingScreen() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.widget.ArrayAdapter<java.lang.Object>> getMAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job initAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job setAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        return null;
    }
    
    public final int getActualDay() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDogsFromDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String weekDay, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> p1) {
        return null;
    }
    
    public AgendaViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.repository.UserRepositoryImpl userRepositoryImpl, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.utils.WeekDaysString items) {
        super(null);
    }
}