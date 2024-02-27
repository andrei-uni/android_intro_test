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

    private val defaultNumber = 0

    companion object {
        const val CURRENT_NUMBER = "CURRENT_NUMBER"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        numberTextView = findViewById(R.id.numberText)
        button = findViewById(R.id.button)

        val number = savedInstanceState?.getInt(CURRENT_NUMBER) ?: defaultNumber

        updateTextViewNumber(number - 1)

        button.setOnClickListener {
            val intent = Intent(
                this,
                SecondActivity::class.java
            ).apply {
                putExtra(SecondActivity.NUM, getTextViewNumber())
            }

            startActivity(intent)
        }

        Log.d(this::class.java.canonicalName, "onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(CURRENT_NUMBER, getTextViewNumber())
    }

    override fun onResume() {
        super.onResume()
        updateTextViewNumber(getTextViewNumber() + 1)

        Log.d(this::class.java.canonicalName, "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d(this::class.java.canonicalName, "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(this::class.java.canonicalName, "onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d(this::class.java.canonicalName, "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(this::class.java.canonicalName, "onDestroy")
    }

    private fun updateTextViewNumber(number: Int) {
        numberTextView.text = number.toString()
    }

    private fun getTextViewNumber(): Int {
        return numberTextView.text.toString().toInt()
    }
}