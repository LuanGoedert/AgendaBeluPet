package com.example.agendabelupet.ui.dogList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0019\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u001aJ!\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0006\u0010(\u001a\u00020\u001aJ)\u0010)\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\r0\r0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lcom/example/agendabelupet/ui/dogList/DogListViewModel;", "Lcom/example/agendabelupet/database/FireBaseDb;", "application", "Landroid/app/Application;", "fireBaseDb", "Lcom/google/firebase/firestore/FirebaseFirestore;", "itemRepositoryImpl", "Lcom/example/agendabelupet/repository/ItemRepositoryImpl;", "userRepositoryImpl", "Lcom/example/agendabelupet/repository/UserRepositoryImpl;", "(Landroid/app/Application;Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/example/agendabelupet/repository/ItemRepositoryImpl;Lcom/example/agendabelupet/repository/UserRepositoryImpl;)V", "loadingProgressBar", "Landroidx/lifecycle/LiveData;", "", "getLoadingProgressBar", "()Landroidx/lifecycle/LiveData;", "mLoadingProgressBar", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "sdf", "Ljava/text/SimpleDateFormat;", "getSdf", "()Ljava/text/SimpleDateFormat;", "succesOnDelete", "getSuccesOnDelete", "deleteLoosePlan", "Lkotlinx/coroutines/Job;", "itemEntity", "Lcom/example/agendabelupet/models/entities/ItemEntity;", "getItemFromRepoById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initLoading", "markItemAsCollected", "dataQuinzenal", "", "(Lcom/example/agendabelupet/models/entities/ItemEntity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markItemAsNotCollected", "(Lcom/example/agendabelupet/models/entities/ItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopLoading", "updateItem", "", "ownerName", "phone", "(Lcom/example/agendabelupet/models/entities/ItemEntity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DogListViewModel extends com.example.agendabelupet.database.FireBaseDb {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mLoadingProgressBar = null;
    @org.jetbrains.annotations.NotNull()
    private final java.text.SimpleDateFormat sdf = null;
    private final com.google.firebase.firestore.FirebaseFirestore fireBaseDb = null;
    private final com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl = null;
    private final com.example.agendabelupet.repository.UserRepositoryImpl userRepositoryImpl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSuccesOnDelete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getSdf() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getItemFromRepoById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.agendabelupet.models.entities.ItemEntity> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateItem(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.models.entities.ItemEntity itemEntity, @org.jetbrains.annotations.NotNull()
    java.lang.String ownerName, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteLoosePlan(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.models.entities.ItemEntity itemEntity) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object markItemAsCollected(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.models.entities.ItemEntity itemEntity, @org.jetbrains.annotations.NotNull()
    java.lang.String dataQuinzenal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object markItemAsNotCollected(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.models.entities.ItemEntity itemEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> p1) {
        return null;
    }
    
    public DogListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore fireBaseDb, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.repository.UserRepositoryImpl userRepositoryImpl) {
        super(null, null, null);
    }
}