package com.diamont.practica01

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //--Quitando el ActionBar
        supportActionBar?.hide().let {
            println("AnthonyRamos-> Action Bar Remove")
        }


        bindignTextInProyect()


        Toast.makeText(this, "Anthony Ramos Romero.", Toast.LENGTH_LONG)

    }

    //--- AnthonyRamos: Metodo para setear los textos de todos los titulos
    fun bindignTextInProyect (){
        lblTitle.text = "Login Now"
        lblSubTitle.text = "Please login to continue using our app."
        lblLoginSocial.text = "Login instantily."
        lblLoginUserAndPass.text = "or login with email/mobile"
        lblRegisterNow.text = "Don't have an account? Register now"
        lblForgotPassword.text = "Forgot Password?"
    }

}