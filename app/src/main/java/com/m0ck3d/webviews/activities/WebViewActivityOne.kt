package com.m0ck3d.webviews.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import com.m0ck3d.webviews.R

class WebViewActivityOne : AppCompatActivity() {

    companion object {
        private const val DEFAULT_URL = "https://www.example.com"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview_one)

        val intentData = intent.data
        val url = intentData?.toString() ?: DEFAULT_URL

        setupWebView(url)
    }
    @SuppressLint("SetJavaScriptEnabled")
    private fun setupWebView(url: String) {
        val webView = findViewById<WebView>(R.id.webView)
        webView.webChromeClient = WebChromeClient()
        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)
    }
}