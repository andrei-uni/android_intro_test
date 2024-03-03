package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivityWithLifecycleLogging() {

    private lateinit var numberTextView: TextView
    private lateinit var button: Button

    companion object {
        const val CURRENT_NUMBER = "CURRENT_NUMBER"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        numberTextView = findViewById(R.id.numberText)
        button = findViewById(R.id.button)

        val number = savedInstanceState?.getInt(CURRENT_NUMBER) ?: -1

        updateTextViewNumber(number + 1)

        button.setOnClickListener {
            val intent = Intent(
                this,
                SecondActivity::class.java
            ).apply {
                putExtra(SecondActivity.NUM, getTextViewNumber())
            }

            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(CURRENT_NUMBER, getTextViewNumber())
    }

    private fun updateTextViewNumber(number: Int) {
        numberTextView.text = number.toString()
    }

    private fun getTextViewNumber(): Int {
        return numberTextView.text.toString().toInt()
    }
}