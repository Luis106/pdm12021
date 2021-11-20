package com.example.pdm12021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailQrCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_qr_code)

        val txtResult: TextView = findViewById(R.id.txtQRresult)
        val qrcode = intent.getStringExtra("qrCodeValue") ///Nombre con el que él intent fue enviado

        txtResult.text = qrcode;
    }
}