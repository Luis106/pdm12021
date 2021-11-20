package com.example.pdm12021

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*


class TimeFighterActivity : AppCompatActivity() {

    internal lateinit var game_score_text_view: TextView;
    internal lateinit var txt_time: TextView;
    internal lateinit var btn_tap_me: TextView;



    private var startMusic : MediaPlayer? = null
    var score : Int = -1

    lateinit var countDownTimer: CountDownTimer;
    var initialCountDownTimer : Long = 5000;
    val countDownInterval: Long = 500;





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_fighter)

        btn_tap_me = findViewById(R.id.btn_tap_me);
        val bounceAnimation = AnimationUtils.loadAnimation(this,R.anim.bounce);
        val shakeAnimtion = AnimationUtils.loadAnimation(this,R.anim.shake);
        initTimer();




        game_score_text_view = findViewById(R.id.game_score_text_view);
        txt_time = findViewById(R.id.txt_time);
        incrementscore();



        btn_tap_me.setOnClickListener {

            Log.d("Buttton","Se dio click en el boton");


            if(score === 0){
                startMusic = MediaPlayer.create(this, R.raw.game)
                startMusic?.start()

                it.startAnimation(bounceAnimation);
                game_score_text_view.startAnimation(shakeAnimtion)
                countDownTimer.start()

            }else if(score >= 0){
                it.startAnimation(bounceAnimation);
                game_score_text_view.startAnimation(shakeAnimtion);
            }
            //btn_tap_me.isEnabled = false;
            incrementscore();

        };


    }

     private fun incrementscore(){
         score++;
         val newscore: String = getString(R.string.score_vaSt, score.toString());
         game_score_text_view.text = newscore;
    }

    private fun initTimer(){
        countDownTimer = object: CountDownTimer(initialCountDownTimer,countDownInterval){
            override fun onTick(p0: Long) {
                val timeleft : Long = p0 / 1000
                Log.d("onTick","onTick")
                txt_time.text = getString(R.string.time, timeleft.toString())
            }

            override fun onFinish() {
                endgame();
                Log.d("EndGame", "EndGame sdada")
            }
        }
    }

    private fun endgame() {
        btn_tap_me.isEnabled = false;

        startMusic?.stop();
        // Libera Memoria
        startMusic?.release();
        // Reproduce sonido de juego finalizado
        startMusic = MediaPlayer.create(this, R.raw.endgame);
        startMusic?.start();
        // Muestra toast con el puntaje
        Toast.makeText(this, getString(R.string.end_game, score.toString()), Toast.LENGTH_LONG).show();

    }

}///Class