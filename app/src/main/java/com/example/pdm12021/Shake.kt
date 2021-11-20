package com.example.pdm12021

import android.content.Context
import android.hardware.SensorManager
import android.hardware.Sensor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Shake : AppCompatActivity() {

    private var mSensorManager: SensorManager? = null
    private var mSensorListener: ShakeEventListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shake)


        mSensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager?
        mSensorListener = ShakeEventListener();




        this.mSensorListener!!.setOnShakeListener {
            Log.d("animacion", "Se hizo el shake")
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