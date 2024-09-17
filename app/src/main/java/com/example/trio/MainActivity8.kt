package com.example.trio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val co: Button= findViewById(R.id.co1)
        co.setOnClickListener {
            val url = "https://www.rgpvnotes.in/btech/grading-system-old/qp/p/computer-science-3rd-year"
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(url)
            }
            startActivity(intent)
        }

        val toggleButton: TextView = findViewById(R.id.fristyear)
        val textView: TextView = findViewById(R.id.fristc)
        val gridLayout: GridLayout = findViewById(R.id.fristb)
        toggleButton.setOnClickListener {
            if (textView.visibility == View.GONE && gridLayout.visibility == View.GONE) {
                textView.visibility = View.VISIBLE
                gridLayout.visibility = View.VISIBLE
            } else {
                textView.visibility = View.GONE
                gridLayout.visibility = View.GONE
            }
            val toggleButton: TextView = findViewById(R.id.secondyear)
            val textView: TextView = findViewById(R.id.secondc)
            val gridLayout: GridLayout = findViewById(R.id.secondb)
            toggleButton.setOnClickListener {
                if (textView.visibility == View.GONE && gridLayout.visibility == View.GONE) {
                    textView.visibility = View.VISIBLE
                    gridLayout.visibility = View.VISIBLE
                } else {
                    textView.visibility = View.GONE
                    gridLayout.visibility = View.GONE
                }
                val toggleButton: TextView = findViewById(R.id.thirdyear)
                val textView: TextView = findViewById(R.id.thirdc)
                val gridLayout: GridLayout = findViewById(R.id.thirdb)
                toggleButton.setOnClickListener {
                    if (textView.visibility == View.GONE && gridLayout.visibility == View.GONE) {
                        textView.visibility = View.VISIBLE
                        gridLayout.visibility = View.VISIBLE
                    } else {
                        textView.visibility = View.GONE
                        gridLayout.visibility = View.GONE
                    }
                    val toggleButton: TextView = findViewById(R.id.forthyear)
                    val textView: TextView = findViewById(R.id.forthc)
                    val gridLayout: GridLayout = findViewById(R.id.forthb)
                    toggleButton.setOnClickListener {
                        if (textView.visibility == View.GONE && gridLayout.visibility == View.GONE) {
                            textView.visibility = View.VISIBLE
                            gridLayout.visibility = View.VISIBLE
                        } else {
                            textView.visibility = View.GONE
                            gridLayout.visibility = View.GONE
                        }
                    }
                }
            }
        }
    }
}
