package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var numberTextView: TextView
    private lateinit var button: Button

    private var currentNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(this::class.java.canonicalName, "onCreate")

        setContentView(R.layout.main_layout)

        numberTextView = findViewById(R.id.numberText)
        button = findViewById(R.id.button)

        updateNumberText()

        button.setOnClickListener {
            val intent = Intent(
                this,
                SecondActivity::class.java
            ).apply {
                putExtra(SecondActivity.NUM, currentNumber)
            }

            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(this::class.java.canonicalName, "onResume")

        currentNumber++
        updateNumberText()
    }

    private fun updateNumberText() {
        numberTextView.text = currentNumber.toString()
    }
}