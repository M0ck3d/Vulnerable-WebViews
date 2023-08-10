package com.m0ck3d.webviews.activities

import android.annotation.SuppressLint
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.m0ck3d.webviews.R
import com.m0ck3d.webviews.interfaces.WebViewInterfaceTwo

class WebViewActivityThree : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled", "JavascriptInterface")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview_three)

        val webView: WebView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.addJavascriptInterface(WebViewInterfaceTwo(), "HackMe")

        webView.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                if (url != null && !isExampleDomain(url)) {
                    view?.loadUrl("about:blank")
                }
                super.onPageStarted(view, url, favicon)
            }

            private fun isExampleDomain(url: String): Boolean {
                return url.startsWith("http://www.example.com") || url.startsWith("https://www.example.com")
            }
        }

        webView.loadUrl("https://www.example.com")
    }
}