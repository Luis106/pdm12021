package com.example.pdm12021

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.airbnb.lottie.LottieAnimationView


class PPT : AppCompatActivity() {

    private var mSensorManager: SensorManager? = null
    private var mSensorListener: ShakeEventListener? = null
    internal lateinit var animations: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ppt)

        mSensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager?
        mSensorListener = ShakeEventListener();
        animations = findViewById(R.id.ani_ppt)

        this.mSensorListener!!.setOnShakeListener {

            var n = (1..3).random()
            Log.d("animations","Resultado: "+n )

            when (n) {
                1 -> animations.setAnimation("gem.json")
                2 -> animations.setAnimation("paper.json")
                3 -> animations.setAnimation("tijeras.json")
            }

            animations.loop(true)
            animations.speed = 1.0f;
            animations.playAnimation()

        }


    }

    override fun onResume() {
        super.onResume()
        mSensorManager!!.registerListener(
            mSensorListener,
            mSensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
            SensorManager.SENSOR_DELAY_UI
        )
    }
    override fun onPause(){
        mSensorManager!!.unregisterListener(mSensorListener)
        super.onPause()
    }
}