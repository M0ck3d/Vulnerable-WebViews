package com.m0ck3d.webviews.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import com.m0ck3d.webviews.R
import com.m0ck3d.webviews.interfaces.WebViewInterface
import com.m0ck3d.webviews.util.url

class WebViewActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview_two)

        ConfigWebView(url)
    }
    @SuppressLint("SetJavaScriptEnabled", "JavascriptInterface")
    private fun ConfigWebView(url :String) {
        val webView: WebView = findViewById(R.id.webView2)
        webView.settings.supportZoom()
        webView.webChromeClient = WebChromeClient()
        webView.settings.allowUniversalAccessFromFileURLs
        webView.settings.javaScriptEnabled = true
        webView.addJavascriptInterface(WebViewInterface(), "Android")
        webView.loadUrl(url)
    }
}