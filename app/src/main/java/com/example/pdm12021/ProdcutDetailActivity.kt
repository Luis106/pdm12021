package com.example.pdm12021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class ProdcutDetailActivity : AppCompatActivity() {

    private lateinit var txtName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prodcut_detail)


        val product = intent.getSerializableExtra("Product")as Product
        txtName = findViewById(R.id.txtproName)
        txtName.setText(product.name)




    }
}