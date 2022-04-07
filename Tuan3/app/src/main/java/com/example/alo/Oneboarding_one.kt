package com.example.alo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Oneboarding_one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oneboarding_one)

        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent = Intent(this@Oneboarding_one, Oneboarding_two::class.java)
            startActivity(intent)
        }
    }
}