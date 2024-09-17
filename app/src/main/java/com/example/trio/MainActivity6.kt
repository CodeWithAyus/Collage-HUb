package com.example.trio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val frist = findViewById<Button>(R.id.mst1)
        frist.setOnClickListener {
            val Intent=Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }
    }
}