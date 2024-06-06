package com.example.mymovieseatbooking;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseHelper {

    private MyDatabaseHelper dbHelper;
    private SQLiteDatabase database;

    public DatabaseHelper(Context context) {
        dbHelper = new MyDatabaseHelper(context);
    }

    public void open() {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }


    public void insertName(String name) {
        ContentValues values = new ContentValues();
        values.put(MyDatabaseHelper.COLUMN_NAME, name);
        database.insert(MyDatabaseHelper.TABLE_NAME, null, values);
    }

    public String getName() {
        Cursor cursor = database.query(MyDatabaseHelper.TABLE_NAME,
                new String[]{MyDatabaseHelper.COLUMN_NAME},
                null, null, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            String name = cursor.getString(cursor.getColumnIndexOrThrow(MyDatabaseHelper.COLUMN_NAME));
            cursor.close();
            return name;
        } else {
            return null;
        }
    }
}
