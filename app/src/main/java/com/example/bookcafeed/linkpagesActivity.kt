package com.example.bookcafeed

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class linkpagesActivity : AppCompatActivity() {

    lateinit var fb: ImageButton
    lateinit var instagr: ImageButton
    lateinit var call: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linkpages)



        fb=findViewById(R.id.facebookryan)
        instagr=findViewById(R.id.instagramryan)
        call=findViewById(R.id.call)


        fb.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100094216815893"))
            startActivity(browserIntent)
        }


        instagr.setOnClickListener {
            val Intented = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ryankatuuz/"))
            startActivity(Intented)
        }




        //call
        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0746122335")
            startActivity(dialIntent)
        }
















    }
}