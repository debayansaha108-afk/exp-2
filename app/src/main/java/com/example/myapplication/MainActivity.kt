package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private fun showLifecycleToast(event: String) {
        MyCustomToast.show(this, event)
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

        showLifecycleToast("onCreate()")
    }

    override fun onStart() {
        super.onStart()
        showLifecycleToast("onStart()")
    }

    override fun onResume() {
        super.onResume()
        showLifecycleToast("onResume()")
    }

    override fun onPause() {
        super.onPause()
        showLifecycleToast("onPause()")
    }

    override fun onStop() {
        super.onStop()
        showLifecycleToast("onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        showLifecycleToast("onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        showLifecycleToast("onDestroy()")
    }
}