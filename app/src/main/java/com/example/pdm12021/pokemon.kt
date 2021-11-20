package com.example.pdm12021

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


private lateinit var nextButton: Button
private lateinit var txt_name: TextView
private lateinit var poke_img: ImageView
private  lateinit var  pokedexLayout: LinearLayout

private val PokemonBank = listOf(
    Pokedex("Articuno",R.drawable.articuno,true),
    Pokedex("Bayleef",R.drawable.bayleef,false),
    Pokedex("Beautifly",R.drawable.beautifly,false),
    Pokedex("Bonsly",R.drawable.bonsly,false),
    Pokedex("Charizard",R.drawable.charizard,false),
    Pokedex("Dewgong",R.drawable.dewgong,false),
    Pokedex("Espeon",R.drawable.espeon,false),
    Pokedex("Furret",R.drawable.furret,false),
    Pokedex("Houndoom",R.drawable.houndoom,false),
    Pokedex("Ivysour",R.drawable.ivysour,false),
    Pokedex("Lapras",R.drawable.lapras,false),
    Pokedex("Leafeon",R.drawable.leafeon,false),
    Pokedex("Lucario",R.drawable.lucario,false),
    Pokedex("Lugia",R.drawable.lugia,false),
    Pokedex("Marowak",R.drawable.marowak,false),
    Pokedex("Mewtwo",R.drawable.mewtwo,true),
    Pokedex("Munchlax",R.drawable.munchlax,false),
    Pokedex("Nidorina",R.drawable.nidorina,false),
    Pokedex("Ninetales",R.drawable.ninetales,false),
    Pokedex("Pidgeotto",R.drawable.pidgeotto,false),
    Pokedex("Snivy",R.drawable.snivy,false),
    Pokedex("Suicune",R.drawable.suicune,false),
    Pokedex("Togetic",R.drawable.togetic,false)

)

private var currentIndex = 0

class pokemon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)


        nextButton = findViewById(R.id.btn_poke)
        txt_name = findViewById(R.id.txt_poke)
        poke_img = findViewById(R.id.img_poke)
        pokedexLayout = findViewById(R.id.linear_pokemon)

        updatepokemon()
        nextButton.setOnClickListener {
            currentIndex = (currentIndex + 1) % PokemonBank.size
            updatepokemon()
        }

    }

    private fun updatepokemon() {

        val name = PokemonBank[currentIndex].name
        txt_name.setText(name);
        val img = PokemonBank[currentIndex].image
        poke_img.setImageResource(img);

        if(PokemonBank[currentIndex].isLegendary){
            pokedexLayout.setBackgroundColor(Color.RED)
        }else{
            pokedexLayout.setBackgroundColor(Color.WHITE)
        }


    }
}

