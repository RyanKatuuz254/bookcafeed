package com.example.bookcafeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class seaActivity : AppCompatActivity() {
    lateinit var sea:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sea)

        sea=findViewById(R.id.buttonsea)
        sea.setOnClickListener {
            val simToolkitlaunchIntent=applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolkitlaunchIntent?.let { startActivity(it) }

        }


    }
}