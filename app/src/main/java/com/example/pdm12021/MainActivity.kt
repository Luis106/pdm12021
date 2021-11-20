package com.example.pdm12021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ///Llamar a pieza de xml por us id en código
        val btnhello: Button = findViewById(R.id.btnhello);
        btnhello.setOnClickListener {
            Log.d("Buttton","Se dio click en el boton");
            val intent = Intent(this,  geoQuiz::class.java).apply {

            };
            startActivity(intent);
        }

        val btnGeo: Button = findViewById(R.id.btn_Geo);
        btnGeo.setOnClickListener {
            Log.d("Buttton","Se dio click en el boton");
            val intent = Intent(this,  geoQuiz::class.java).apply {

            };
            startActivity(intent);
        }

        val btn_TFA: Button = findViewById(R.id.btn_TFA);
        btn_TFA.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this,  TimeFighterActivity::class.java).apply {

            };
            startActivity(intent);
        }

        val btn_IMC: Button = findViewById(R.id.btn_IMC);
        btn_IMC.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this,  IMC::class.java).apply {

            };
            startActivity(intent);
        }

        val btn_Par: Button = findViewById(R.id.btn_Par);
        btn_Par.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this,  Parcial1::class.java).apply {
            };
            startActivity(intent);
        }

        val btn_poke: Button = findViewById(R.id.btn_pokedex);
        btn_poke.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this,  pokemon::class.java).apply {
            };
            startActivity(intent);
        }


        val btn_animations2: Button = findViewById(R.id.btn_animations2);
        btn_animations2.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this,  Animations::class.java).apply {
            };
            startActivity(intent);
        }

        val btn_shake: Button = findViewById(R.id.btn_shake);
        btn_shake.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this,  Shake::class.java).apply {
            };
            startActivity(intent);
        }


        val btn_PPT: Button = findViewById(R.id.btn_PPT);
        btn_PPT.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this, PPT::class.java).apply {
            };
            startActivity(intent);
        }

        val btn_QR: Button = findViewById(R.id.btn_QR);
        btn_QR.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this, QRreader::class.java).apply {
            };
            startActivity(intent);
        }

        val btn_Maps: Button = findViewById(R.id.btn_Maps);
        btn_Maps.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this, Maps::class.java).apply {
            };
            startActivity(intent);
        }

        val btn_Web: Button = findViewById(R.id.btn_Web);
        btn_Web.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this, WebView::class.java).apply {
            };
            startActivity(intent);
        }
        val btn_Dia: Button = findViewById(R.id.btn_diaAc);
        btn_Dia.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this, Dialog_Ac::class.java).apply {
            };
            startActivity(intent);
        }
        val btn_WS: Button = findViewById(R.id.btn_ws);
        btn_WS.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this, WebService::class.java).apply {
            };
            startActivity(intent);
        }
        val btn_LP: Button = findViewById(R.id.btn_LP);
        btn_LP.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this, list_view_product::class.java).apply {
            };
            startActivity(intent);
        }
        val btn_FBT: Button = findViewById(R.id.btn_FBT);
        btn_FBT.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this, MyFirebase::class.java).apply {
            };
            startActivity(intent);
        }
        val btn_WEBLIST: Button = findViewById(R.id.btn_WEBSERLis);
        btn_WEBLIST.setOnClickListener {
            Log.d("Buttton","Se dio click en el btn_TFA ");
            val intent = Intent(this, webServicesList::class.java).apply {
            };
            startActivity(intent);
        }

    }
}

