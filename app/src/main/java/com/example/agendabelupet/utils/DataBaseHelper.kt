package com.example.agendabelupet.utils

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBaseHelper(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, 1) {
    companion object {
        private val DATABASE_NAME = "user.db"
        private val TABLE_NAME = "tbl_user"
        private val CAL_NO1 = "Category_img"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE $TABLE_NAME (ID INTEGER PRIMARY KEY AUTOINCREMENT, CategoryImg Text)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun insertData(categoryImg: ByteArray ): Boolean{
        val db  = writableDatabase
        val contentValues = ContentValues()
        contentValues.put(CAL_NO1, categoryImg)

        val result  = db.insert(TABLE_NAME, null, contentValues)

        return !result.equals( -1)
    }

    fun getdata(): ByteArray {
        val db = writableDatabase
        val res = db.rawQuery("select * from " + TABLE_NAME, null)

        if (res.moveToFirst()) {
            do {
                return res.getBlob(0)
            } while (res.moveToNext())
        }
        return byteArrayOf()
    }


}