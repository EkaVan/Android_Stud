package com.example.lab02;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText A;
    EditText B;
    TextView Res;
    float numbA, numbB;
    Button btnAdd, btnMinus, btnMult, btnDelenie, btnSin, btnCos, btnTg, btnSqrt, btnPow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A = findViewById(R.id.editA);
        B = findViewById(R.id.editB);
        Res = findViewById(R.id.textOutRes);

        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnMult = findViewById(R.id.btnMult);
        btnDelenie = findViewById(R.id.btnDelenie);

        btnSin = findViewById(R.id.btnSin);
        btnCos = findViewById(R.id.btnCos);
        btnTg = findViewById(R.id.btnTg);

        btnSqrt = findViewById(R.id.btnSqrt);
        btnPow = findViewById(R.id.btnPow);
    }

    public void btnActive(View v)
    {
        try
        {
            numbA = Float.parseFloat(A.getText().toString());
            if (v == btnSin || v == btnCos || v == btnTg)
            {
                numbA = (float)(numbA * 180 / Math.PI);
            }
            if (v != btnSqrt && v != btnSin && v != btnCos && v != btnTg)
            {
                numbB = Float.parseFloat(B.getText().toString());
            }
        }
        catch (Exception ex)
        {
            Res.setText("Ошибка: " + ex);
            return;
        }

        float res = 0;

        if (v == btnAdd)
        {
            res = numbA + numbB;
        }
        if (v == btnMinus)
        {
            res = numbA - numbB;
        }
        if (v == btnMult)
        {
            res = numbA * numbB;
        }
        if (v == btnDelenie)
        {
            if (numbB != 0)
            {
                res = numbA / numbB;
            }
            else
            {
                Res.setText("Ошибка! Нельзя делить на 0!");
                return;
            }
        }
        if (v == btnSin)
        {
            res = (float)Math.sin(numbA);
        }
        if (v == btnCos)
        {
            res = (float)Math.cos(numbA);
        }
        if (v == btnTg)
        {
            res = (float)Math.tan(numbA);
        }
        if (v == btnSqrt)
        {
            if (numbA >= 0)
            {
                res = (float)Math.sqrt(numbA);
            }
            else
            {
                Res.setText("Ошибка! Корень меньше, чем 0 нельзя!!");
                return;
            }
        }
        if (v == btnPow)
        {
            res = (float)Math.pow(numbA, numbB);
        }

        Res.setText(" " + String.valueOf(res));
    }
}