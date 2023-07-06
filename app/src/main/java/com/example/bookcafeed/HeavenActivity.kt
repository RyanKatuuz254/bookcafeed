package com.example.bookcafeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HeavenActivity : AppCompatActivity() {
    lateinit var purchase:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heaven)


        purchase=findViewById(R.id.buttonheaven)
        purchase.setOnClickListener {
            val simToolkitlaunchIntent=applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolkitlaunchIntent?.let { startActivity(it) }

        }


    }
}