package com.example.ciclodevida

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"OnCreate chamado")


        val tvCount = findViewById<TextView>(R.id.tv_count)
        val btnCount = findViewById<Button>(R.id.btn_count)
        if (savedInstanceState != null){
            counter = savedInstanceState.getInt("myCount")
            tvCount.text = counter.toString()
        }

        btnCount.setOnClickListener{
            counter = counter + 1
            tvCount.text = counter.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("myCount", counter)
        super.onSaveInstanceState(outState)
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