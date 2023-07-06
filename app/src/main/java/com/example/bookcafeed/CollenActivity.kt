package com.example.bookcafeed

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class CollenActivity : AppCompatActivity() {


    lateinit var fb: TextView

    lateinit var tweet: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collen)

        fb=findViewById(R.id.textcollen)

        tweet=findViewById(R.id.texttwitter)

        fb.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/writercolleenoakley/"))
            startActivity(browserIntent)
        }




        tweet.setOnClickListener {
            val browserIntents = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/OakleyColleen"))
            startActivity(browserIntents)
        }











    }





}