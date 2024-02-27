package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    companion object {
        const val NUM = "Num"
    }

    private lateinit var squaredNumberText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val number = intent.getIntExtra(NUM, 0)

        squaredNumberText = findViewById(R.id.squaredNumberText)
        squaredNumberText.text = "${number * number}"

        Log.d(this::class.java.canonicalName, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(this::class.java.canonicalName, "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(this::class.java.canonicalName, "onStop")
    }

    override fun onResume() {
        super.onResume()
        Log.d(this::class.java.canonicalName, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(this::class.java.canonicalName, "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(this::class.java.canonicalName, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(this::class.java.canonicalName, "onDestroy")
    }
}