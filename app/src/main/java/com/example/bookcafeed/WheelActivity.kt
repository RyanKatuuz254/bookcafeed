package com.example.bookcafeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WheelActivity : AppCompatActivity() {
    lateinit var wheel:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wheel)
        wheel=findViewById(R.id.buttonwheel)
        wheel.setOnClickListener {
            val simToolkitlaunchIntent=applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolkitlaunchIntent?.let { startActivity(it) }

        }


    }
}