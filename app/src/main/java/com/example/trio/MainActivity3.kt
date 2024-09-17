package com.example.trio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val text = findViewById<TextView>(R.id.btxt)
        text.setOnClickListener {
            val Intent = Intent(this, offer::class.java)
            startActivity(Intent)
        }
        val btech = findViewById<ImageView>(R.id.btechof)
        btech.setOnClickListener {
            val Intent = Intent(this, offer::class.java)
            startActivity(Intent)
        }
        val polytxt = findViewById<TextView>(R.id.polytxt)
        polytxt.setOnClickListener {
            val intent = Intent(this, offer::class.java)
            intent.putExtra("scrollToPolyId", true)
            startActivity(intent)
        }
        val polyofImageView = findViewById<ImageView>(R.id.polyof)
        polyofImageView.setOnClickListener {
            val intent = Intent(this, offer::class.java)
            intent.putExtra("scrollToPolyId", true)
            startActivity(intent)
        }
        val low =findViewById<ImageView>(R.id.lowim)
        low.setOnClickListener {
            val Intent=Intent(this,MainActivity4::class.java)
            startActivity(Intent)
        }
        val lowtx=findViewById<TextView>(R.id.lowtx)
        lowtx.setOnClickListener {
            val Intent=Intent(this,MainActivity4::class.java)
            startActivity(Intent)
        }
        val coursetx = findViewById<TextView>(R.id.coursetx)
        coursetx.setOnClickListener {
            val intent = Intent(this, offer::class.java)
            intent.putExtra("scrollToPolyId", true)
            startActivity(intent)
        }
        val courseim = findViewById<ImageView>(R.id.courceim)
        courseim.setOnClickListener {
            val intent = Intent(this, offer::class.java)
            intent.putExtra("scrollToPolyId", true)
            startActivity(intent)
        }


    }
}