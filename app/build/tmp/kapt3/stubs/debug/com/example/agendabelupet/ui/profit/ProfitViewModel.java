package com.example.agendabelupet.ui.profit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/agendabelupet/ui/profit/ProfitViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "itemRepositoryImpl", "Lcom/example/agendabelupet/repository/ItemRepositoryImpl;", "(Landroid/app/Application;Lcom/example/agendabelupet/repository/ItemRepositoryImpl;)V", "listaFinal", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/github/mikephil/charting/data/PieEntry;", "getListaFinal", "()Landroidx/lifecycle/MutableLiveData;", "mValor", "", "mValueQUinzenal", "", "mValueSemanal", "valor", "Landroidx/lifecycle/LiveData;", "getValor", "()Landroidx/lifecycle/LiveData;", "valueQuinzenal", "getValueQuinzenal", "valueSemanal", "getValueSemanal", "getAllValues", "Lkotlinx/coroutines/Job;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProfitViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> mValueSemanal = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> mValueQUinzenal = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mValor = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.github.mikephil.charting.data.PieEntry>> listaFinal = null;
    private final com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getValueSemanal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getValueQuinzenal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getValor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.github.mikephil.charting.data.PieEntry>> getListaFinal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllValues(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> p0) {
        return null;
    }
    
    public ProfitViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl) {
        super(null);
    }
}