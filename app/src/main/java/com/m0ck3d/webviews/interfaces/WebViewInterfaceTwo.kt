package com.m0ck3d.webviews.interfaces

import android.webkit.JavascriptInterface

class WebViewInterfaceTwo {

    @JavascriptInterface
    fun displayFlagTwo(): String {
        return "Super Secret Code: " + (4000 .. 5000).random()
    }
}