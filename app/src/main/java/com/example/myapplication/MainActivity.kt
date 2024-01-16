package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var simpleTV = findViewById<TextView>(R.id.simpleTV)
        simpleTV.text = "nie klikniety"

        var simpleBTN = findViewById<Button>(R.id.simpleBTN)
        simpleBTN.setOnClickListener{
            simpleTV.text="klikniety"
        }
    }
}