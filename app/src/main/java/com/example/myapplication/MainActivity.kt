package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        showToast("onCreate()")
    }

    override fun onStart() {
        super.onStart()
        showToast("onStart()")
    }

    override fun onResume() {
        super.onResume()
        showToast("onResume()")
    }

    override fun onPause() {
        super.onPause()
        showToast("onPause()")
    }

    override fun onStop() {
        super.onStop()
        showToast("onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        showToast("onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast("onDestroy()")
    }
}