package com.example.alo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("MAIN-ATC", "onCreate")
        setContentView(R.layout.oneboarding_one)





    }

    override fun onStart() {
        super.onStart()
        Log.e("MAIN-ATC", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MAIN-ATC", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MAIN-ATC", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MAIN-ATC", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MAIN-ATC", "onDestroy")
    }
}