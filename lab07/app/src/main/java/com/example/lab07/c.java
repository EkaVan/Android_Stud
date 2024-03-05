package com.example.lab07;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class c extends SQLiteOpenHelper
{
    public c(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
String sql = "CREATE TABLE my_test (my_key ILX, my_value ILXI);";
db.execSQL(sql);
    }

    public void do_incert(String key, String value)
    {
        String sql;
        sql = "INSERT INTO my_test VALUES(" + key + "," + value + ");";
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sql);
    }

    public void do_delete(String key, String value)
    {
        String sql;
        sql = "DELETE FROM my_test WHERE my_key= "  + key + ";";
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sql);
    }

    public String do_select(String key)
    {
        String sql = "SELECT my_value FROM my_test WHERE my_key= "  + key + ";";
        SQLiteDatabase db = getReadableDatabase();
        Cursor cur = db.rawQuery(sql,  null);

        if (cur.moveToFirst()==true)
            return cur.getString(0);
        return "(!) not found";
    }

    public String do_update(String key)
    {
        String sql = "UPDATE my_value FROM my_test WHERE my_key= "  + key + ";";
        SQLiteDatabase db = getReadableDatabase();
        Cursor cur = db.rawQuery(sql,  null);

        if (cur.moveToFirst()==true)
            return cur.getString(0);
        return "(!) not found";
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
