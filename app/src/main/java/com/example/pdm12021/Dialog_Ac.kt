package com.example.pdm12021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Dialog_Ac : AppCompatActivity() {

    lateinit var  btn_diaLog: Button
    lateinit var  btnCancell: Button;
    lateinit var  textPass: EditText
    lateinit var  textName: EditText;
    lateinit var  textEmail: EditText;
    lateinit var  txtValues: TextView;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)



        val btn_showdia: Button = findViewById(R.id.btn_ShowDia)
        val btn_DiaImg: Button = findViewById(R.id.Btn_DiaImg)
        txtValues  = findViewById(R.id.txt_diaR)

        btn_showdia.setOnClickListener {

            /// Vista de la pantalla de dialogo
            val dialogView = layoutInflater.inflate(R.layout.dialog_login, null)
            ///Variable auxilíar que muestra el dialogo y lo controla
            val mBuilder = AlertDialog.Builder(this)
                .setView(dialogView).setTitle("Login dialog").show()
                ///Sacar los ides del dialogView
                btn_diaLog = dialogView.findViewById(R.id.btnLogin)
                btnCancell = dialogView.findViewById(R.id.btnCancelLoginDialog)



                textName = dialogView.findViewById(R.id.txtName)
                textPass = dialogView.findViewById(R.id.txtPass)
                textEmail = dialogView.findViewById(R.id.txtEmail)

                btnCancell.setOnClickListener{
                    Log.d("button","cancel")
                    mBuilder.dismiss()
                }

                btn_diaLog.setOnClickListener{

                    val  pass = textPass.text.toString()
                    val email = textEmail.text.toString()
                    val name = textName.text.toString()

                    Log.d("debug",  pass + email + name)
                    txtValues.setText(" Nombre: " + name + " Email: " + email + " Contraseña: " + pass)
                    mBuilder.dismiss()
                }

        }


        btn_DiaImg.setOnClickListener {

            /// Vista de la pantalla de dialogo
            val dialogView = layoutInflater.inflate(R.layout.dialogimage, null)
            ///Variable auxilíar que muestra el dialogo y lo controla
            val mBuilder = AlertDialog.Builder(this)
                .setView(dialogView).setTitle("Leafeon ").show()



        }
    }
}