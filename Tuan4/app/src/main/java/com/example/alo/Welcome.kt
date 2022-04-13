package com.example.alo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        val button_signup = findViewById<Button>(R.id.button_signup)
        button_signup.setOnClickListener {
            val intent = Intent(this@Welcome, Sign_up::class.java)
            startActivity(intent)
        }
        val button_login = findViewById<Button>(R.id.button_login)
        button_login.setOnClickListener {
            val intent = Intent(this@Welcome, Login::class.java)
            startActivity(intent)
        }


    }


}