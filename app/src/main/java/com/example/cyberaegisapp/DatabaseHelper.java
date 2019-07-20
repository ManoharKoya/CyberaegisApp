package com.example.cyberaegisapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper( Context context) {
        super(context, "Details", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table sign_in(Id INTEGER Primary key Autoincrement, username TEXT, email TEXT," +
                "mobileNO TEXT, gander TEXT, password TEXT) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("drop table if exists sign_in");
            onCreate(db);
    }

    public boolean insertData(String name,String email,String number,String gender,String passcode){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("username", name);
        cv.put("email", email);
        cv.put("mobileNO", number);
        cv.put("gender",gender);
        cv.put("password",passcode);
        long r = db.insert("sign_in",null,cv);
        if(r==-1) return false;
        else return true;
    }

    public void shoWdata(){}

}
