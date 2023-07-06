package com.example.bookcafeed

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ReidActivity : AppCompatActivity() {




    lateinit var fb: ImageButton
    lateinit var instaf: ImageButton
    lateinit var tweet: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reid)




        instaf=findViewById(R.id.instareid)
        tweet=findViewById(R.id.tweetreid)


        instaf.setOnClickListener {
            val Intented = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/kileyreid/"))
            startActivity(Intented)
        }


        tweet.setOnClickListener {
            val browserIntents = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/kileyreid"))
            startActivity(browserIntents)
        }



    }
}