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
        Log.d(this::class.java.canonicalName, "onCreate")

        setContentView(R.layout.activity_second)

        val number = intent.getIntExtra(NUM, 0)

        squaredNumberText = findViewById(R.id.squaredNumberText)
        squaredNumberText.text = "${number * number}"
    }
}