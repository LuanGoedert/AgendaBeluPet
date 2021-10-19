package com.example.agendabelupet.ui.newPlan;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001eR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u001f\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\r0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/example/agendabelupet/ui/newPlan/NewPlanViewModel;", "Lcom/example/agendabelupet/database/FireBaseDb;", "application", "Landroid/app/Application;", "itemRepositoryImpl", "Lcom/example/agendabelupet/repository/ItemRepositoryImpl;", "userRepositoryImpl", "Lcom/example/agendabelupet/repository/UserRepositoryImpl;", "fireBaseDb", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Landroid/app/Application;Lcom/example/agendabelupet/repository/ItemRepositoryImpl;Lcom/example/agendabelupet/repository/UserRepositoryImpl;Lcom/google/firebase/firestore/FirebaseFirestore;)V", "_isItemSaved", "Landroidx/lifecycle/MutableLiveData;", "", "get_isItemSaved", "()Landroidx/lifecycle/MutableLiveData;", "dayOfWeek", "", "getDayOfWeek", "isItemSaved", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isbiweekly", "kotlin.jvm.PlatformType", "getIsbiweekly", "wrongDaySet", "getWrongDaySet", "saveDog", "", "itemEntity", "Lcom/example/agendabelupet/models/entities/ItemEntity;", "context", "Landroid/content/Context;", "(Lcom/example/agendabelupet/models/entities/ItemEntity;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDog", "Lkotlinx/coroutines/DisposableHandle;", "app_debug"})
public final class NewPlanViewModel extends com.example.agendabelupet.database.FireBaseDb {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isbiweekly = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> dayOfWeek = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> wrongDaySet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isItemSaved = null;
    private final com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl = null;
    private final com.example.agendabelupet.repository.UserRepositoryImpl userRepositoryImpl = null;
    private final com.google.firebase.firestore.FirebaseFirestore fireBaseDb = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getIsbiweekly() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getDayOfWeek() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getWrongDaySet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_isItemSaved() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isItemSaved() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveDog(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.models.entities.ItemEntity itemEntity, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.DisposableHandle updateDog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.models.entities.ItemEntity itemEntity) {
        return null;
    }
    
    public NewPlanViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.repository.ItemRepositoryImpl itemRepositoryImpl, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.repository.UserRepositoryImpl userRepositoryImpl, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore fireBaseDb) {
        super(null, null, null);
    }
}