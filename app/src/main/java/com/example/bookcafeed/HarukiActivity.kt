package com.example.bookcafeed

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class HarukiActivity : AppCompatActivity() {
    lateinit var face:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_haruki)

        face=findViewById(R.id.faceharuki)

        face.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/harukimurakamiauthor"))
            startActivity(browserIntent)
        }






    }
}