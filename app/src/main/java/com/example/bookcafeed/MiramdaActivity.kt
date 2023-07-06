package com.example.bookcafeed

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MiramdaActivity : AppCompatActivity() {
    lateinit var fb:TextView
    lateinit var instag:TextView
    lateinit var tweet:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_miramda)


        fb=findViewById(R.id.mirandaface)
        instag=findViewById(R.id.mirandainsta)
        tweet=findViewById(R.id.mirandatweet)

        fb.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/AuthorMeganMiranda/"))
            startActivity(browserIntent)
        }


        instag.setOnClickListener {
            val Intented = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/meganlmiranda/"))
            startActivity(Intented)
        }


        tweet.setOnClickListener {
            val browserIntents = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/MeganLMiranda"))
            startActivity(browserIntents)
        }
























    }
}