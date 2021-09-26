package com.example.agendabelupet.ui.collected;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/example/agendabelupet/ui/collected/CollectedItemsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "itemRepositoryImpl", "Lcom/example/agendabelupet/repository/ItemRepositoryImpl;", "(Landroid/app/Application;Lcom/example/agendabelupet/repository/ItemRepositoryImpl;)V", "_listItemsCollected", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/agendabelupet/models/entities/ItemEntity;", "get_listItemsCollected", "()Landroidx/lifecycle/MutableLiveData;", "listItemsCollected", "Landroidx/lifecycle/LiveData;", "getListItemsCollected", "()Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/Job;", "type", "", "app_debug"})
public final class CollectedItemsViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> _listItemsCollected = null;
    private final com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> get_listItemsCollected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> getListItemsCollected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getListItemsCollected(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    public CollectedItemsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl) {
        super(null);
    }
}