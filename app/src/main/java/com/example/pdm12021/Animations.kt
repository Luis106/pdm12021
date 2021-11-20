package com.example.pdm12021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class Animations : AppCompatActivity() {

    internal lateinit var animations: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animations)

        //animations = findViewById(R.id.moon)


    }
}