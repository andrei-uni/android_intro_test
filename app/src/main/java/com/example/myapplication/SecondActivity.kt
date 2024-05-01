package com.example.myapplication

import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivityWithLifecycleLogging() {

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
    }
}