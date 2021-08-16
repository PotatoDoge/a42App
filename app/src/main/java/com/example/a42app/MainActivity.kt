package com.example.a42app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val logIn = findViewById<Button>(R.id.logIn_button)
        logIn.setOnClickListener {
            val intent = Intent(this,LogInActivity::class.java)
            startActivity(intent)
        }
    }
}
