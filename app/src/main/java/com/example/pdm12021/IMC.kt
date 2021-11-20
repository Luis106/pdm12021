package com.example.pdm12021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val txt_1: EditText = findViewById(R.id.txt_1);
        val txt_2: EditText = findViewById(R.id.txt_2);
        val txt_r: TextView = findViewById(R.id.txt_r);


        val btn_Cal: Button = findViewById(R.id.btn_cal);

        btn_Cal.setOnClickListener {
            Log.d("Buttton","Se dio click en el boton");
            var n1 = txt_1.text.toString().toDouble();
            var n2 = txt_2.text.toString().toDouble();

            // n2 = n2 /100;
           // Toast.makeText(this, "Ealtura " + n2, Toast.LENGTH_LONG).show();

            var r = n1/Math.pow((n2),2.0);

            if(r< 18.5){
                Toast.makeText(this, "Bajo", Toast.LENGTH_LONG).show();
            }else if (r >=18.5 && r < 25){
                Toast.makeText(this, "Normal", Toast.LENGTH_LONG).show();

            }else if (r >=25 && r < 30){
                Toast.makeText(this, "Sobrepeso", Toast.LENGTH_LONG).show();

            }else if (r >=30 && r < 35.5){
                Toast.makeText(this, "Obesidad I", Toast.LENGTH_LONG).show();

            }else if (r >=35.5 && r < 40){
                Toast.makeText(this, "Obesidad II", Toast.LENGTH_LONG).show();

            }else{
                Toast.makeText(this, "Obesidad III", Toast.LENGTH_LONG).show();
            }

           // Toast.makeText(this, "masa " + n1, Toast.LENGTH_LONG).show();
            //Toast.makeText(this, "Ealtura " + n2, Toast.LENGTH_LONG).show();

            txt_r.text = r.toString();

        };


    }


}