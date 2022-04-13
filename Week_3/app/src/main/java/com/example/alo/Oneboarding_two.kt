package com.example.alo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Oneboarding_two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oneboarding_two)
        val button_obd_two = findViewById<Button>(R.id.button_obd_two)
        button_obd_two.setOnClickListener {
            val intent = Intent(this@Oneboarding_two, Oneboarding_three::class.java)
            startActivity(intent)
        }
    }
}