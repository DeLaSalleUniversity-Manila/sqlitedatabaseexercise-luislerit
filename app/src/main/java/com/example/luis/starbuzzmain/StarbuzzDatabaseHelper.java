package com.example.luis.starbuzzmain;

/**
 * Created by luis on 10/20/2015.
 */


import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

 class StarbuzzDatabaseHelper extends SQLiteOpenHelper{
private static final String DB_NAME = "starbuzz";  //name of database
     private static final int DB_VERSION = 1; //version

    StarbuzzDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
