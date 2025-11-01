package com.example.profileui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This function handles the window insets for you.
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        // The manual OnApplyWindowInsetsListener block has been removed.
        // It was conflicting with enableEdgeToEdge() and causing the crash.
    }
}
