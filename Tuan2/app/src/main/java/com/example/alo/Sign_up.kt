package com.example.alo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)
        val button_back_signup = findViewById<Button>(R.id.button_back_signup)
        val button_login_signup= findViewById<Button>(R.id.button_login_signup)
        button_back_signup.setOnClickListener {
            val intent = Intent(this@Sign_up, Welcome::class.java)
            startActivity(intent)
        }
        button_login_signup.setOnClickListener {
            val intent = Intent(this@Sign_up, Login::class.java)
            startActivity(intent)
        }
    }
}