package com.example.bookcafeed

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class RebeccaActivity : AppCompatActivity() {


    lateinit var fb: TextView
    lateinit var insta: TextView
    lateinit var tweet: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rebecca)


        fb=findViewById(R.id.rebeccaface)
        insta=findViewById(R.id.rebeccainsta)
        tweet=findViewById(R.id.rebeccatweet)

        fb.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/RebeccaSerleAuthor/"))
            startActivity(browserIntent)
        }


        insta.setOnClickListener {
            val Intented = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/rebecca_serle/"))
            startActivity(Intented)
        }


        tweet.setOnClickListener {
            val browserIntents = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/RebeccaASerle"))
            startActivity(browserIntents)
        }




    }
}