package com.example.trio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ScrollView
import android.widget.TextView

class aboutcoll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutcoll)


        val webView: WebView = findViewById(R.id.webview)
        val video =
            "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FDO9NXD1htk?si=z9c1E9tsTLjf6w27\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
        webView.loadData(video, "text/html", "utf-8")
        webView.settings.javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()

        if (intent.getBooleanExtra("scrollToFamassage", false)) {
            val scrollView = findViewById<FrameLayout>(R.id.mystatic)
            val famassageTextView = findViewById<TextView>(R.id.famassage)
            scrollView.post {
                scrollView.scrollTo(0, famassageTextView.top)
            }
            }
    }
        }