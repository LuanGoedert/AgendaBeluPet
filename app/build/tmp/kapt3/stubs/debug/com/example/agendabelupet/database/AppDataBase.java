package com.example.agendabelupet.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.agendabelupet.utils.DateToTimestampConverter.class})
@androidx.room.Database(entities = {com.example.agendabelupet.models.entities.ItemEntity.class, com.example.agendabelupet.models.entities.UserEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/agendabelupet/database/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "itemDao", "Lcom/example/agendabelupet/dao/ItemDao;", "userDao", "Lcom/example/agendabelupet/dao/UserDao;", "app_debug"})
public abstract class AppDataBase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.agendabelupet.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.agendabelupet.dao.ItemDao itemDao();
    
    public AppDataBase() {
        super();
    }
}