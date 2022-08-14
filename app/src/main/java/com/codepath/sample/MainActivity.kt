package com.codepath.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener() {
            Log.v("hello", "The say hello button is clicked!")
            Toast.makeText(this, "Hello Jynx, happy to meet you!", Toast.LENGTH_SHORT).show()
        }
    }
}