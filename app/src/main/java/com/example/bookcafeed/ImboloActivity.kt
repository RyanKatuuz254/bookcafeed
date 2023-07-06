package com.example.bookcafeed

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ImboloActivity : AppCompatActivity() {
    lateinit var face:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imbolo)

        face=findViewById(R.id.faceimbolo)

        face.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/imbolombue/"))
            startActivity(browserIntent)
        }


    }
}