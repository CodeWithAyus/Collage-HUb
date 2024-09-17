package com.example.trio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val logsignActbutton = findViewById<TextView>(R.id.twlbtn)
        logsignActbutton.setOnClickListener {
            val intent = Intent(this, teacherlogin::class.java)
            startActivity(intent)
        }
        val itActbutton = findViewById<TextView>(R.id.trdbtn)
        itActbutton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        val signActbutton = findViewById<TextView>(R.id.signbtn)
        signActbutton.setOnClickListener {
            val intent = Intent(this, loginsubmit::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        if (isOnlogin()) {
            navigateToMainActivity()
        } else {
            super.onBackPressed()
        }
    }

    private fun isOnlogin(): Boolean {
        return javaClass.simpleName == "login"
    }

    private fun navigateToMainActivity() {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}