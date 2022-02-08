package com.example.worldcinema

import android.app.ApplicationErrorReport
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_in_screen.*
import kotlinx.android.synthetic.main.activity_sign_up_screen.view.*

class SignInScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)


    }

    fun go(view: View) {
        val intent = Intent(this, SignUpScreen::class.java)
        startActivity(intent)
    }

    fun login(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}