package com.manan.studentapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbhandeler extends SQLiteOpenHelper {
    public dbhandeler(@Nullable Context context) {
        super(context, "MCA1", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE STUDENT1(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,AGE TEXT,GENDER TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public  void adddata(String name,String age,String gender)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("NAME",name);
        contentValues.put("AGE",age);
        contentValues.put("GENDER",gender);
        sqLiteDatabase.insert("STUDENT1",null,contentValues);
    }
}
