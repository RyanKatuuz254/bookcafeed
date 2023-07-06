package com.example.bookcafeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class annaActivity : AppCompatActivity() {
    lateinit var pay:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anna)


        pay=findViewById(R.id.buttonanna)
        pay.setOnClickListener {
            val simToolkitlaunchIntent=applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolkitlaunchIntent?.let { startActivity(it) }

        }




    }
}