package com.example.bookcafeed

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class TerryActivity : AppCompatActivity() {


    lateinit var fb: TextView
    lateinit var instar: TextView
    lateinit var tweet: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terry)

        fb=findViewById(R.id.terryface)

        tweet=findViewById(R.id.terrytweet)

        fb.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ms.terrymcmillan/"))
            startActivity(browserIntent)
        }


        tweet.setOnClickListener {
            val browserIntents = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/MsTerryMcMillan"))
            startActivity(browserIntents)
        }





    }
}