package com.example.pdm12021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.messaging.FirebaseMessaging

class MyFirebase : AppCompatActivity() {

    private lateinit var txtNotification: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_firebase)

         txtNotification = findViewById(R.id.txtFirebaseToken)

        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.w("Firebase", "Fetching FCM registration token failed", task.exception)
                return@OnCompleteListener
            }

            // Get new FCM registration token
            val token = task.result
            // Log and toast
            token?.let { Log.d("Firebase", it) }
            txtNotification.setText(token)
            Log.d("token",  token.toString())

            //Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
        })

    }
}