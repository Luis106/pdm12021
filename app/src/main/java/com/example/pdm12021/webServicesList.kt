package com.example.pdm12021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson

class webServicesList : AppCompatActivity() {

    lateinit var Listweb: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_services_list)



        Listweb = findViewById(R.id.listViewWebService)
        var url = "https://gist.githubusercontent.com/jorgegit/0fc4f55b4cbc7b0af714e01e35731b60/raw/6df82eaf326cd734bffa472678cfd876fc6bebd8/dataArray.json"
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(
            Request.Method.GET, url, Response.Listener { response ->

                Log.d("response","La respuesta es ${response}")

                val peoplelist = Gson().fromJson(response, PeopleInfo::class.java).people

                Log.d("Name", "${peoplelist[0].name}")

                val adapter = peopleAdpter(this, peoplelist)

                Listweb.adapter = adapter

        },
            Response.ErrorListener {

            })
        queue.add(stringRequest)
    }
}