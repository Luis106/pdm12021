package com.example.pdm12021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView

class list_view_product : AppCompatActivity() {

    private lateinit var product_list_view: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_product)

        val Articuno = Product("Articuno Sticker", 25.00, "Articuno Stiker de vinil", R.drawable.articuno)
        val Espeon = Product("Espeon Sticker", 24.95, "Espeon Stiker de vinil", R.drawable.espeon)
        val Leafeon = Product("Leafeon Sticker", 10.00, "Leafeon Stiker de vinil", R.drawable.leafeon)

        product_list_view = findViewById(R.id.produc_list_view)

        val productList = listOf(Articuno,Espeon,Leafeon)
        val adpater = ProductAdapter(this, productList)

        product_list_view.adapter = adpater

        product_list_view.setOnItemClickListener { adapterView, view, i, l ->
            Log.d("Precio", "Sera de ${productList[i].price}")
            productList[i].price

            val intent = Intent(this, ProdcutDetailActivity::class.java)
            intent.putExtra("Product", productList[i])
            startActivity(intent)

        }


    }
}