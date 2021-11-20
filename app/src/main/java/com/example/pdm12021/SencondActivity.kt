package com.example.pdm12021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class SencondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sencond)



        val txt_s: TextView = findViewById(R.id.txt_sa);
        txt_s.text = "Bienvendio Luis";

        val imgv: ImageView = findViewById(R.id.imgv);


        val btn1: Button = findViewById(R.id.btn_1);
        btn1.setOnClickListener {
            Log.d("Buttton","Se dio click en el boton");

            Toast.makeText(this, "Mensaje Boton 1", Toast.LENGTH_LONG).show();
            imgv.visibility = View.INVISIBLE;

            };

        val btn2: Button = findViewById(R.id.btn_2);
        btn2.setOnClickListener {
            Log.d("Buttton","Se dio click en el boton");

            Toast.makeText(this, "Mensaje boton 2", Toast.LENGTH_SHORT).show();
            imgv.visibility = View.VISIBLE;

        };



    }

}