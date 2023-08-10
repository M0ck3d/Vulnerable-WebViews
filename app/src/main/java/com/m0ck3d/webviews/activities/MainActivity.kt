package com.m0ck3d.webviews.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.m0ck3d.webviews.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button1.setOnClickListener {
            Intent(this, WebViewActivityOne::class.java).also {
                startActivity(it)
            }

        }
        button2.setOnClickListener {
            Intent(this, WebViewActivityTwo::class.java).also {
                startActivity(it)
            }
        }

        button3.setOnClickListener {
            Intent(this, WebViewActivityThree::class.java).also {
                startActivity(it)
            }
        }
    }
}