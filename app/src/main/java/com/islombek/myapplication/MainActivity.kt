package com.islombek.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstButton: Button = findViewById(R.id.firstButton)
        firstButton.setText(R.string.app_name)
        firstButton.setOnClickListener {
            Log.i("#1", "First Button clicked")
        }

        val secondButton: Button = findViewById(R.id.secondButton)
        secondButton.setText(R.string.app_name)
        secondButton.setOnClickListener {
            Log.i("#2", "Second Button clicked")
        }

        val thirdButton: Button = findViewById(R.id.thirdButton)
        thirdButton.setText(R.string.app_name)
        thirdButton.setOnClickListener {
            Log.i("#3", "Third Button clicked")
        }

    }

}