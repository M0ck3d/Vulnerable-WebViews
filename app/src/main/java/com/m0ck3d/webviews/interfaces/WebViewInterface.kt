package com.m0ck3d.webviews.interfaces

import android.webkit.JavascriptInterface

class WebViewInterface {

    @JavascriptInterface
    fun displayFlagOne(): String {
        return "Super Secret Code: " + (1000 .. 2000).random()
    }
}