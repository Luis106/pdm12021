package com.example.pdm12021

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ProductAdapter(private val mContext: Context, private val listProducts: List<Product>):
        ArrayAdapter<Product>(mContext, 0, listProducts) {

        private lateinit var itemName: TextView
        private lateinit var itemPrice: TextView
        private lateinit var itemDescription: TextView
        private lateinit var imageView: ImageView

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            // Se manda llamar el layout para cada uno de los items
            val layout = LayoutInflater.from(mContext).inflate(R.layout.product_item, parent, false)
            val product = listProducts[position]
            itemName = layout.findViewById(R.id.itemName)
            itemPrice = layout.findViewById(R.id.tiemPrice)
            itemDescription = layout.findViewById(R.id.itemDescription)
            imageView = layout.findViewById(R.id.imageViewProduct)
            itemName.text = product.name
            itemPrice.text = "$${product.price}"
            itemDescription.text = product.description
            imageView.setImageResource(product.image)
            return layout
        }
    }