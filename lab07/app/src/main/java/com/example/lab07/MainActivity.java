package com.example.lab07;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText txt_key;
    EditText txt_value;

    c mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_key = findViewById(R.id.txt_key);
        txt_value = findViewById(R.id.txt_value);

        mydb=new c(this, "mybase.db", null, 1);
    }

    public void on_incert_click(View v)
    {
        String key = txt_key.getText().toString();
        String value= txt_value.getText().toString();

        mydb.do_incert(key,value);
    }

    public void on_update_click(View v)
    {
        String key = txt_key.getText().toString();
        String value= mydb.do_update(key);

        txt_value.setText(value);
    }

    public void on_select_click(View v)
    {
        String key = txt_key.getText().toString();
        String value= mydb.do_select(key);

        txt_value.setText(value);
    }

    public void on_delete_click(View v)
    {
        String key = txt_key.getText().toString();
        String value= txt_value.getText().toString();

        mydb.do_delete(key,value);
    }
}