package com.example.bookcafeed

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class HellenActivity : AppCompatActivity() {

    lateinit var fb: TextView
    lateinit var insta: TextView
    lateinit var tweet: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hellen2)

        fb=findViewById(R.id.hellenface)
        insta=findViewById(R.id.textViewhellen)
        tweet=findViewById(R.id.texthellen)

        fb.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/HelenPhillipsAuthor/"))
            startActivity(browserIntent)
        }


        insta.setOnClickListener {
            val Intented = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/helen.philipps/"))
            startActivity(Intented)
        }


        tweet.setOnClickListener {
            val browserIntents = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/helencphillips"))
            startActivity(browserIntents)
        }








    }
}