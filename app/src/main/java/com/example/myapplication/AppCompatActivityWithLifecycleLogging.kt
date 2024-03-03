package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class AppCompatActivityWithLifecycleLogging : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
