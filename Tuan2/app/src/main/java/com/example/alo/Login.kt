package com.example.alo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val button_back = findViewById<Button>(R.id.button_back)
        val button_sigup_login = findViewById<Button>(R.id.button_signup_login)

        button_back.setOnClickListener {
            val intent = Intent(this@Login, Welcome::class.java)


            startActivity(intent)
        }


        val button_login = findViewById<Button>(R.id.button_login)
        val email_login = findViewById<EditText>(R.id.email_login)
        val password_login = findViewById<EditText>(R.id.password_login)
//
//
//
//
//
//
        button_login.setOnClickListener {
            if ((email_login.text.toString()
                    .trim() == "ronaldo@gmail.com") && (password_login.text.toString()
                    .trim() == "123456")
            ) {
                Toast.makeText(this@Login, "Successfully", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@Login, Profile::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this@Login, "User account or password incorrect", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button_sigup_login.setOnClickListener {
            val intent = Intent(this@Login, Sign_up::class.java)
            startActivity(intent)

        }
    }
















}