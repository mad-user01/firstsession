package com.example.worldcinema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_in_screen.*
import kotlinx.android.synthetic.main.activity_sign_up_screen.*

class SignUpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)
    }

    fun click(view: View) {
        val intent = Intent(this, SignInScreen::class.java)
        startActivity((intent))
    }

    fun click1(view: View) {
        val pass1 = pass11.toString()
        val pass2 = pass22.toString()


        if (pass1==pass2) {
            val message = "Введённые пароли не совпадают."
            val z = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, message, z)
        }
        else{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}