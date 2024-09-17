package com.example.trio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val Intent = Intent(this, MainActivity2::class.java)
            startActivity(Intent)
        }
        val passwordEditText = findViewById<EditText>(R.id.passbtn)
        val showPasswordIcon = findViewById<ImageView>(R.id.image)

        fun togglePasswordVisibility(view: View) {
            if (passwordEditText.transformationMethod == PasswordTransformationMethod.getInstance()) {
                // Password is currently hidden, so show it
                passwordEditText.transformationMethod = null
                showPasswordIcon.setImageResource(R.drawable.happy)
            } else {
                passwordEditText.transformationMethod = PasswordTransformationMethod.getInstance()
                showPasswordIcon.setImageResource(R.drawable.happy)
            }
        }


    }
    }
