package com.example.myapplication_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import  android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spi_f;
    Spinner spi_t;
    EditText in_fr;
    TextView str_t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spi_f=findViewById(R.id.from_spiner);

        spi_t=findViewById(R.id.to_spiner);

        in_fr=findViewById(R.id.from_inter);
        str_t=findViewById(R.id.to_inter);

        ArrayAdapter <String> adp = new <String> ArrayAdapter(this, android.R.layout.simple_list_item_1);

        adp.add("mm");
        adp.add("сm");
        adp.add("m");
        adp.add("km");

        spi_f.setAdapter(adp);
        spi_t.setAdapter(adp);


    }
    public void on_convert(View v)
    {
        float from = Float.parseFloat(in_fr.getText().toString());

        String sf = (String) spi_f.getSelectedItem();
        String sto = (String) spi_t.getSelectedItem();

        float tot = 0.0f;

        if (sf.equals("mm"))
        {
            if(sto.equals("mm"))
            {
                tot = from*1.0f;
                str_t.setText(String.valueOf(tot));
            }
            if(sto.equals("cm"))
            {
                tot = from* 0.1f;
                str_t.setText(String.valueOf(tot));
            }
            if(sto.equals("m"))
            {
                tot = from* 0.001f;
                str_t.setText(String.valueOf(tot));
            }
            if(sto.equals("km"))
            {
                tot = from* 0.000001f;
                str_t.setText(String.valueOf(tot));
            }

            str_t.setText(String.valueOf(tot));
        }


        if (sf.equals("сm"))
        {
            if(sto.equals("mm"))
            {
                tot = from*10.0f;
                str_t.setText(String.valueOf(tot));
            }
            if(sto.equals("cm"))
            {
                tot = from* 1.0f;
                str_t.setText(String.valueOf(tot));
            }
            if(sto.equals("m"))
            {
                tot = from /100.0f;
                str_t.setText(String.valueOf(tot));
            }
            if(sto.equals("km"))
            {
                tot = from / 100000.0f;
                str_t.setText(String.valueOf(tot));
            }

            str_t.setText(String.valueOf(tot));
        }

        if (sf.equals("m"))
        {
            if(sto.equals("mm"))
            {
                tot = from*1000.0f;
                str_t.setText(String.valueOf(tot));
            }
            if(sto.equals("cm"))
            {
                tot = from* 100.0f;
                str_t.setText(String.valueOf(tot));
            }
            if(sto.equals("m"))
            {
                tot = from*1.0f;
                str_t.setText(String.valueOf(tot));
            }
            if(sto.equals("km"))
            {
                tot = from / 1000.0f;
                str_t.setText(String.valueOf(tot));
            }

            str_t.setText(String.valueOf(tot));
        }

        if (sf.equals("km"))
        {
            if(sto.equals("mm"))
            {
                tot = from*1000000.0f;
                str_t.setText(String.valueOf(tot));
            }
            if(sto.equals("cm"))
            {
                tot = from* 100000.0f;
                str_t.setText(String.valueOf(tot));
            }
            if(sto.equals("m"))
            {
                tot = from*1000.0f;
                str_t.setText(String.valueOf(tot));
            }
            if(sto.equals("km"))
            {
                tot = from * 1.0f;
                str_t.setText(String.valueOf(tot));
            }

            str_t.setText(String.valueOf(tot));
        }

        str_t.setText(String.valueOf(tot));

    }
}