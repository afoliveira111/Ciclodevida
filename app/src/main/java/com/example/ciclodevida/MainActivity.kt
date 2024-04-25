package com.example.ciclodevida

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"OnCreate chamado")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"OnStart chamado")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume chamado")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause chamado")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop chamado")

    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy chamado")
        super.onDestroy()

    }
}