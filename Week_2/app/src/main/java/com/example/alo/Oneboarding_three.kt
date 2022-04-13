package com.example.alo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Oneboarding_three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oneboarding_three)
        val button_obd_three = findViewById<Button>(R.id.button_obd_three)
        button_obd_three.setOnClickListener {
            val intent = Intent(this@Oneboarding_three, Welcome::class.java)
            startActivity(intent)
        }
    }
}