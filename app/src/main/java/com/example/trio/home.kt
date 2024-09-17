package com.example.trio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val callage = findViewById<Button>(R.id.aboutcollage)
        callage.setOnClickListener {
            val intent = Intent(this, aboutcoll::class.java)
            startActivity(intent)
        }
        val finite=findViewById<Button>(R.id.serviceof)
        finite.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        val homekey = findViewById<TextView>(R.id.homekye)
        homekey.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        if (intent.getBooleanExtra("scrollToPolyId", false)) {
            // Scroll to polyid TextView
            val scrollView =
                findViewById<FrameLayout>(R.id.mystatic)
            val polyidTextView =
                findViewById<TextView>(R.id.famassage)
            scrollView.post {
                scrollView.scrollTo(0, polyidTextView.top)
            }

            val offer = findViewById<Button>(R.id.serviceof)
            offer.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
            if (intent.getBooleanExtra("scrollToPolyId", false)) {
                // Scroll to polyid TextView
                val scrollView =
                    findViewById<ScrollView>(R.id.polyfi)
                val polyidTextView =
                    findViewById<TextView>(R.id.polyid)
                scrollView.post {
                    scrollView.scrollTo(0, polyidTextView.top)
                }


            }
        }
    }
}