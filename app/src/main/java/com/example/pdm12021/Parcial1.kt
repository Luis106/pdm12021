package com.example.pdm12021

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout

class Parcial1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcial1)

        val numTo: EditText = findViewById(R.id.numTo);
        val numAc: EditText = findViewById(R.id.numAc);
        val numres: TextView = findViewById(R.id.numres);
        val Screen_CL: ConstraintLayout = findViewById(R.id.Screen_CL);
        var num: Double = 0.0

        val btn1: Button = findViewById(R.id.btn1);
        btn1.setOnClickListener {
            Log.d("Buttton","Se dio click en el boton");

            num = numAc.text.toString().toDouble() + 5
           // Toast.makeText(this,"Valor "+ num, Toast.LENGTH_LONG).show();
            numAc.setText(num.toString())
        };

        val btn2: Button = findViewById(R.id.btn2);
        btn2.setOnClickListener {
            Log.d("Buttton","Se dio click en el boton");
            num = numAc.text.toString().toDouble() + 15
           // Toast.makeText(this,"Valor "+ num, Toast.LENGTH_LONG).show();
            numAc.setText(num.toString())
        };

        val btn3: Button = findViewById(R.id.btn3);
        btn3.setOnClickListener {
            Log.d("Buttton","Se dio click en el boton");
            num = numAc.text.toString().toDouble() + 30
           // Toast.makeText(this,"Valor "+ num, Toast.LENGTH_LONG).show();
            numAc.setText(num.toString())
        };

        val btn4: Button = findViewById(R.id.btn4);
        btn4.setOnClickListener {
            Log.d("Buttton","Se dio click en el boton");
            num = numAc.text.toString().toDouble() + 50.0
            //Toast.makeText(this,"Valor "+ num, Toast.LENGTH_LONG).show();
            numAc.setText(num.toString())
        };

        val imgbT: ImageButton = findViewById(R.id.imgbT);
        imgbT.setOnClickListener {
            Log.d("Buttton","Se dio click en el boton");
            num = numTo.text.toString().toDouble() * 80
            Toast.makeText(this,"Manzanas de la producción total: "+ num, Toast.LENGTH_LONG).show();

        };

        val imgbA: ImageButton = findViewById(R.id.ImgbA);
        imgbA.setOnClickListener {
            Log.d("Buttton","Se dio click en el boton");
            num = numAc.text.toString().toDouble() * 80
            Toast.makeText(this,"Manzanas de la producción actuala: "+ num, Toast.LENGTH_SHORT).show();

        };
        val btn_total: Button = findViewById(R.id.btn_total);
        btn_total.setOnClickListener {
            Log.d("Buttton","Se dio click en el boton");
            num = (numAc.text.toString().toDouble() * 100)/ (numTo.text.toString().toDouble())
            //Toast.makeText(this,"Valor "+ num, Toast.LENGTH_LONG).show();
            numres.setText(num.toString())

            if (num > 70){
                Screen_CL.setBackgroundColor(Color.RED);

            }else{
                Screen_CL.setBackgroundColor(Color.WHITE);
            }
        };








    }
}