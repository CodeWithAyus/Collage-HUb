package com.example.trio

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class teacherlogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacherlogin)

        val logsignActbutton = findViewById<TextView>(R.id.trdbtn)
        logsignActbutton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
val signin=findViewById<TextView>(R.id.signbtn)
        signin.setOnClickListener {
            val Intent=Intent(this,MainActivity5::class.java)
            startActivity(Intent)
        }

        val itActbutton = findViewById<TextView>(R.id.twlbtn)
        itActbutton.setOnClickListener {
            val intent = Intent(this, teacherlogin::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (isOnteacherlogin()) {

            navigateToMainActivity()
        } else {
            super.onBackPressed()
        }
    }

    private fun isOnteacherlogin(): Boolean {
        return javaClass.simpleName == "teacherlogin"
    }

    private fun navigateToMainActivity() {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
