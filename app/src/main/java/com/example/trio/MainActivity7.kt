package com.example.trio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View // Import this for View.GONE and View.VISIBLE
import android.widget.Button
import android.widget.GridLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val texxtButton: Button = findViewById(R.id.cse)
        texxtButton.setOnClickListener {
            val url =
                "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/CS%20III%20Sy100719012330.pdf"
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(url)
            }
            startActivity(intent)
        }

        val toggleButton: ImageView = findViewById(R.id.finalb)
        val contentLayout: GridLayout = findViewById(R.id.mylayout)

        toggleButton.setOnClickListener {
            if (contentLayout.visibility == View.GONE) { // Corrected 'view.GONE' to 'View.GONE'
                contentLayout.visibility = View.VISIBLE
            } else {
                contentLayout.visibility = View.GONE
            }
            val toggleButton: ImageView = findViewById(R.id.finaldown)
            val contentLayout: GridLayout = findViewById(R.id.fdown)

            toggleButton.setOnClickListener {
                if (contentLayout.visibility == View.GONE) { // Corrected 'view.GONE' to 'View.GONE'
                    contentLayout.visibility = View.VISIBLE
                } else {
                    contentLayout.visibility = View.GONE
                }
                val toggleButton: ImageView = findViewById(R.id.middown)
                val contentLayout: GridLayout = findViewById(R.id.midd)

                toggleButton.setOnClickListener {
                    if (contentLayout.visibility == View.GONE) { // Corrected 'view.GONE' to 'View.GONE'
                        contentLayout.visibility = View.VISIBLE
                    } else {
                        contentLayout.visibility = View.GONE
                    }
                    val toggleButton: ImageView = findViewById(R.id.quitedown)
                    val contentLayout: GridLayout = findViewById(R.id.qdown)

                    toggleButton.setOnClickListener {
                        if (contentLayout.visibility == View.GONE) { // Corrected 'view.GONE' to 'View.GONE'
                            contentLayout.visibility = View.VISIBLE
                        } else {
                            contentLayout.visibility = View.GONE
                        }
                    }
                }
            }
        }
    }
}
