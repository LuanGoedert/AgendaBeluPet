package com.example.agendabelupet.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!Jy\u0010\"\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u0019\u0010.\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010/\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00060"}, d2 = {"Lcom/example/agendabelupet/interfaces/ItemRepository;", "", "delete", "", "item", "Lcom/example/agendabelupet/models/entities/ItemEntity;", "(Lcom/example/agendabelupet/models/entities/ItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteItemById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllItems", "", "getItemById", "getItemsCollected", "getItemsNotCollected", "getItemsNotCollectedByweekDay", "itemDay", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValues", "getValuesQuinzenal", "getValuesSemanal", "insert", "setItemsCollected", "collected", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updateDataQuinzenal", "dataQuinzenal", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateItemById", "ownername", "name", "race", "weekDay", "plan", "value", "phone", "district", "street", "houseNumber", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateToCollected", "updateToNotCollected", "app_debug"})
public abstract interface ItemRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.models.entities.ItemEntity item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.models.entities.ItemEntity item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateItemById(int id, @org.jetbrains.annotations.NotNull()
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
    kotlin.coroutines.Continuation<? super kotlin.Unit> p13);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.models.entities.ItemEntity item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllDb(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteItemById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateToCollected(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateToNotCollected(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getItemsNotCollectedByweekDay(@org.jetbrains.annotations.NotNull()
    java.lang.String itemDay, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getItemsCollected(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllItems(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getItemsNotCollected(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.agendabelupet.models.entities.ItemEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getValues(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Integer>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateDataQuinzenal(@org.jetbrains.annotations.NotNull()
    java.lang.String dataQuinzenal, int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getValuesQuinzenal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Integer>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getValuesSemanal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Integer>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getItemById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.agendabelupet.models.entities.ItemEntity> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setItemsCollected(boolean collected, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}