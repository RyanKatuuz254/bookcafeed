package com.example.bookcafeed

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class KarenActivity : AppCompatActivity() {

    lateinit var fb: TextView
    lateinit var insta: TextView
    lateinit var tweet: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karen)



        fb=findViewById(R.id.KARENFACE)
        insta=findViewById(R.id.KARENINSTA)
        tweet=findViewById(R.id.KARENTWEET)

        fb.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/KarenKingsbury/"))
            startActivity(browserIntent)
        }


        insta.setOnClickListener {
            val Intented = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/karenkingsbury/"))
            startActivity(Intented)
        }


        tweet.setOnClickListener {
            val browserIntents = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/KarenKingsbury"))
            startActivity(browserIntents)
        }












    }
}