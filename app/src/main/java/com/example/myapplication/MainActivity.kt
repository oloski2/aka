package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var MyInput = findViewById<EditText>(R.id.MyInput)
        var MyInput2 = findViewById<EditText>(R.id.MyInput2)
        var simpleTV = findViewById<TextView>(R.id.simpleTV)
        simpleTV.text = "nie klikniety"

        var simpleBTN = findViewById<Button>(R.id.simpleBTN)

        MyInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                updateResult()
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        MyInput2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                updateResult()
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        simpleBTN.setOnClickListener {

        }
    }

    private fun updateResult() {
        val MyInput = findViewById<EditText>(R.id.MyInput)
        val MyInput2 = findViewById<EditText>(R.id.MyInput2)
        val simpleTV = findViewById<TextView>(R.id.simpleTV)

        val num1 = MyInput.text.toString().toIntOrNull() ?: 0
        val num2 = MyInput2.text.toString().toIntOrNull() ?: 0

        val result = num1 + num2
        simpleTV.text = "$result"
    }
}
