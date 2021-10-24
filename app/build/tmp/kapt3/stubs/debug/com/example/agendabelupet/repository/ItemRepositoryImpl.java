package com.example.agendabelupet.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$Jy\u0010%\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u0019\u00101\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u00102\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00063"}, d2 = {"Lcom/example/agendabelupet/repository/ItemRepositoryImpl;", "Lcom/example/agendabelupet/interfaces/ItemRepository;", "itemDao", "Lcom/example/agendabelupet/dao/ItemDao;", "(Lcom/example/agendabelupet/dao/ItemDao;)V", "delete", "", "item", "Lcom/example/agendabelupet/models/entities/ItemEntity;", "(Lcom/example/agendabelupet/models/entities/ItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteItemById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllItems", "", "getItemById", "getItemsCollected", "getItemsNotCollected", "getItemsNotCollectedByweekDay", "itemDay", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValues", "getValuesQuinzenal", "getValuesSemanal", "insert", "setItemsCollected", "collected", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updateDataQuinzenal", "dataQuinzenal", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateItemById", "ownername", "name", "race", "weekDay", "plan", "value", "phone", "district", "street", "houseNumber", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateToCollected", "updateToNotCollected", "app_debug"})
public final class ItemRepositoryImpl implements com.example.agendabelupet.interfaces.ItemRepository {
    private final com.example.agendabelupet.dao.ItemDao itemDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.models.entities.ItemEntity item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.models.entities.ItemEntity item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateItemById(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String ownername, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String race, @org.jetbrains.annotations.NotNull()
    java.lang.String weekDay, @org.jetbrains.annotations.NotNull()
    java.lang.String plan, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String district, @org.jetbrains.annotations.NotNull()
    java.lang.String street, @org.jetbrains.annotations.NotNull()
    java.lang.String houseNumber, boolean collected, @org.jetbrains.annotations.NotNull()
    java.lang.String dataQuinzenal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p13) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.models.entities.ItemEntity item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteAllDb(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateToCollected(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateToNotCollected(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getItemsNotCollectedByweekDay(@org.jetbrains.annotations.NotNull()
    java.lang.String itemDay, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getItemsCollected(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllItems(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteItemById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getItemsNotCollected(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getValues(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Integer>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateDataQuinzenal(@org.jetbrains.annotations.NotNull()
    java.lang.String dataQuinzenal, int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getValuesQuinzenal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Integer>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getValuesSemanal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Integer>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getItemById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.agendabelupet.models.entities.ItemEntity> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object setItemsCollected(boolean collected, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public ItemRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.dao.ItemDao itemDao) {
        super();
    }
}