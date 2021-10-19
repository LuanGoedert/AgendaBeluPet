package com.example.agendabelupet.ui.collected;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!J\u000e\u0010\u0013\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020\u001eJ\u0014\u0010$\u001a\u00020\u001e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010&\u001a\u00020\u001eR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00160\u00160\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/agendabelupet/ui/collected/CollectedItemsViewModel;", "Lcom/example/agendabelupet/database/FireBaseDb;", "application", "Landroid/app/Application;", "itemRepositoryImpl", "Lcom/example/agendabelupet/repository/ItemRepositoryImpl;", "userRepositoryImpl", "Lcom/example/agendabelupet/repository/UserRepositoryImpl;", "fireBaseDb", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Landroid/app/Application;Lcom/example/agendabelupet/repository/ItemRepositoryImpl;Lcom/example/agendabelupet/repository/UserRepositoryImpl;Lcom/google/firebase/firestore/FirebaseFirestore;)V", "_listItemsCollected", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/agendabelupet/models/entities/ItemEntity;", "get_listItemsCollected", "()Landroidx/lifecycle/MutableLiveData;", "listItemsCollected", "Landroidx/lifecycle/LiveData;", "getListItemsCollected", "()Landroidx/lifecycle/LiveData;", "loadingProgressBar", "", "getLoadingProgressBar", "mLoadingProgressBar", "kotlin.jvm.PlatformType", "user", "Lcom/example/agendabelupet/models/entities/UserEntity;", "getUser", "deleteAllDb", "Lkotlinx/coroutines/Job;", "getItemsFirebase", "userEmail", "", "type", "initLoading", "saveItems", "itemsList", "stopLoading", "app_debug"})
public final class CollectedItemsViewModel extends com.example.agendabelupet.database.FireBaseDb {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.agendabelupet.models.entities.UserEntity> user = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> _listItemsCollected = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mLoadingProgressBar = null;
    private final com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl = null;
    private final com.example.agendabelupet.repository.UserRepositoryImpl userRepositoryImpl = null;
    private final com.google.firebase.firestore.FirebaseFirestore fireBaseDb = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.agendabelupet.models.entities.UserEntity> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> get_listItemsCollected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> getListItemsCollected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getListItemsCollected(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.agendabelupet.models.entities.ItemEntity> itemsList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getItemsFirebase(@org.jetbrains.annotations.NotNull()
    java.lang.String userEmail) {
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
    public final kotlinx.coroutines.Job deleteAllDb() {
        return null;
    }
    
    public CollectedItemsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.repository.UserRepositoryImpl userRepositoryImpl, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore fireBaseDb) {
        super(null, null, null);
    }
}