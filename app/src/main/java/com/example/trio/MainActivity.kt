package com.example.trio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import pl.droidsonroids.gif.GifImageView


class MainActivity : AppCompatActivity() {
    private var backPressedOnce = false
    private lateinit var textanim: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val resulticon=findViewById<GifImageView>(R.id.home66)
        resulticon.setOnClickListener{
            val Intent=Intent(this,MainActivity6::class.java)
            startActivity(Intent)
        }
        val sylabus=findViewById<ImageView>(R.id.home44)
        sylabus.setOnClickListener {
            val intent=Intent(this,MainActivity7::class.java)
            startActivity(intent)
        }
        val result=findViewById<TextView>(R.id.result)
        result.setOnClickListener {
            val Internt=Intent(this,MainActivity6::class.java)
            startActivity(Internt)
        }
        val Notes=findViewById<ImageView>(R.id.notes)
        Notes.setOnClickListener {
            val intent=Intent(this,MainActivity8::class.java)
            startActivity(intent)
        }

        val iconActbutton = findViewById<ImageView>(R.id.homebtn)
        iconActbutton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        val hometx = findViewById<TextView>(R.id.hometx)
        hometx.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        val logsignActbutton = findViewById<TextView>(R.id.finalend)
        logsignActbutton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        val ofActbutton = findViewById<ImageView>(R.id.homicn)
        ofActbutton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        val abouttex = findViewById<Button>(R.id.about2)
        abouttex.setOnClickListener {
            val intent = Intent(this, aboutcoll::class.java)
            startActivity(intent)
        }
        val attend=findViewById<ImageView>(R.id.home22)
        attend.setOnClickListener {
            val Intent=Intent(this,MainActivity4::class.java)
            startActivity(Intent)
        }
        val textActbutton = findViewById<TextView>(R.id.hometx)
        ofActbutton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        if (backPressedOnce) {
            super.onBackPressed()
            finishAffinity()
        }
        val sylabus=findViewById<ImageView>(R.id.home44)
        sylabus.setOnClickListener {
            val Intent = Intent(this,MainActivity4::class.java)
            startActivity(Intent)
        }
        backPressedOnce = true
        Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show()

        // Reset backPressedOnce after a short duration (in milliseconds)
        val resetDelay: Long = 2000 // 2 seconds
        android.os.Handler().postDelayed({
            backPressedOnce = false
        }, resetDelay)

    }

    fun open_main(view: View) {}


}



