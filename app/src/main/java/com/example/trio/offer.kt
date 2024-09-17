package com.example.trio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ScrollView
import android.widget.TextView

class offer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)

        val textViewId = intent.getIntExtra("polyid", 0)
        if (textViewId != 0) {
            val destinationTextView = findViewById<TextView>(textViewId)
            destinationTextView.requestFocus(R.id.polyid)
        }
        setContentView(R.layout.activity_offer)

        // Check if the intent contains the flag to scroll to polyid
        if (intent.getBooleanExtra("scrollToPolyId", false)) {
            // Scroll to polyid TextView
            val scrollView =
                findViewById<ScrollView>(R.id.polyfi)
            val polyidTextView =
                findViewById<TextView>(R.id.polyid)
            scrollView.post {
                scrollView.scrollTo(0, polyidTextView.top)
            }
            val textViewId = intent.getIntExtra("polyid", 0)
            if (textViewId != 0) {
                val destinationTextView = findViewById<TextView>(textViewId)
                destinationTextView.requestFocus(R.id.polyid)
            }
            setContentView(R.layout.activity_offer)

            // Check if the intent contains the flag to scroll to polyid
            if (intent.getBooleanExtra("scrollToPolyId", false)) {
                // Scroll to polyid TextView
                val scrollView =
                    findViewById<ScrollView>(R.id.polyfi)
                val polyidTextView =
                    findViewById<TextView>(R.id.polyid)
                scrollView.post {
                    scrollView.scrollTo(0, polyidTextView.top)
                }
                val textViewId = intent.getIntExtra("polyid", 0)
                if (textViewId != 0) {
                    val destinationTextView = findViewById<TextView>(textViewId)
                    destinationTextView.requestFocus(R.id.polyid)
                }
                setContentView(R.layout.activity_offer)

                // Check if the intent contains the flag to scroll to polyid
                if (intent.getBooleanExtra("scrollToPolyId", false)) {
                    // Scroll to polyid TextView
                    val scrollView =
                        findViewById<ScrollView>(R.id.polyfi)
                    val polyidTextView =
                        findViewById<TextView>(R.id.polyid)
                    scrollView.post {
                        scrollView.scrollTo(0, polyidTextView.top)
                    }
                    val textViewId = intent.getIntExtra("polyid", 0)
                    if (textViewId != 0) {
                        val destinationTextView = findViewById<TextView>(textViewId)
                        destinationTextView.requestFocus(R.id.polyid)
                    }
                    setContentView(R.layout.activity_offer)

                    // Check if the intent contains the flag to scroll to polyid
                    if (intent.getBooleanExtra("scrollToPolyId", false)) {
                        // Scroll to polyid TextView
                        val scrollView =
                            findViewById<ScrollView>(R.id.polyfi)
                        val polyidTextView =
                            findViewById<TextView>(R.id.polyid)
                        scrollView.post {
                            scrollView.scrollTo(0, polyidTextView.top)
                        }
                        if (intent.getBooleanExtra("scrollToCourId", false)) {
                                    // Scroll to polyid TextView
                                    val scrollView =
                                        findViewById<ScrollView>(R.id.polyfi) // Your ScrollView ID
                                    val polyidTextView =
                                        findViewById<TextView>(R.id.courid) // Replace with the actual ID of the polyid TextView
                                    scrollView.post {
                                        scrollView.scrollTo(0, polyidTextView.top)
                                    }
                                }
                            }
                        }
                        }
                    }

                    }
                }

