package com.example.pdm12021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import com.android.volley.Response
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson


class WebService : AppCompatActivity() {

    private  lateinit var  txtbName: EditText
    private  lateinit var  txtbDir: EditText
    private  lateinit var  txtbTel: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_service)

        txtbName = findViewById(R.id.txtB_wsN)
        txtbDir = findViewById(R.id.txtB_wsDir)
        txtbTel = findViewById(R.id.txtB_wsTel)

        var url = "https://api.json-generator.com/templates/ZIEuPTBOxDyF/data?access_token=xw79poluqa642w0bfzd8616jf0ofl359z0d8tv1v"
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(Request.Method.GET, url, Response.Listener { response ->
            Log.d("response","La respuesta es ${response}")

            val contact = Gson().fromJson(response, info::class.java)

            txtbName.setText(contact.name)
            txtbDir.setText(contact.address)
            txtbTel.setText(contact.phone)

        },
            Response.ErrorListener {

            })
        queue.add(stringRequest)

    }
}