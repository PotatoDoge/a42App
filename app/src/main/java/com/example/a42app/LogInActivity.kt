package com.example.a42app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val enterButton = findViewById<Button>(R.id.enter_button)
        enterButton.setOnClickListener {
            val intent = Intent(this,MenuScreenActivity::class.java)
            startActivity(intent)
        }
    }
}