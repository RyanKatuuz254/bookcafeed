package com.example.bookcafeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FireActivity : AppCompatActivity() {

    lateinit var fire:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fire)

        fire=findViewById(R.id.buttonfire)
        fire.setOnClickListener {
            val simToolkitlaunchIntent=applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolkitlaunchIntent?.let { startActivity(it) }

        }





    }
}