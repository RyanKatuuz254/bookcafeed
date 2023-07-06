package com.example.bookcafeed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView

class authorsActivity : AppCompatActivity() {

    lateinit var au1:ImageView
    lateinit var au2:ImageView
    lateinit var au3:ImageView
    lateinit var au4:ImageView
    lateinit var au5:ImageView
    lateinit var au6:ImageView
    lateinit var au7:ImageView
    lateinit var au8:ImageView
    lateinit var au9:ImageView
    lateinit var au10:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authors)

        au1=findViewById(R.id.author1)
        au2=findViewById(R.id.author2)
        au3=findViewById(R.id.author3)
        au4=findViewById(R.id.author4)
        au5=findViewById(R.id.author5)
        au6=findViewById(R.id.author6)
        au7=findViewById(R.id.author7)
        au8=findViewById(R.id.author8)
        au9=findViewById(R.id.author9)
        au10=findViewById(R.id.author10)


        au1.setOnClickListener {
            Toast.makeText(applicationContext, "You moved to author social platform", Toast.LENGTH_LONG).show()
            var map= Intent(this,CollenActivity::class.java)
            startActivity(map)

        }

        au2.setOnClickListener {
            Toast.makeText(applicationContext, "You moved to author social platform", Toast.LENGTH_LONG).show()
            var map= Intent(this,HarukiActivity::class.java)
            startActivity(map)

        }
        au3.setOnClickListener {
            Toast.makeText(applicationContext, "You moved to author social platform", Toast.LENGTH_LONG).show()
            var map= Intent(this,HellenActivity::class.java)
            startActivity(map)

        }

        au4.setOnClickListener {
            Toast.makeText(applicationContext, "You moved to author social platform", Toast.LENGTH_LONG).show()
            var map= Intent(this,KarenActivity::class.java)
            startActivity(map)

        }
        au5.setOnClickListener {
            Toast.makeText(applicationContext, "You moved to author social platform", Toast.LENGTH_LONG).show()
            var map= Intent(this,GrahamActivity::class.java)
            startActivity(map)

        }
        au6.setOnClickListener {
            Toast.makeText(applicationContext, "You moved to author social platform", Toast.LENGTH_LONG).show()
            var map= Intent(this,ImboloActivity::class.java)
            startActivity(map)

        }

        au7.setOnClickListener {
            Toast.makeText(applicationContext, "You moved to author social platform", Toast.LENGTH_LONG).show()
            var map= Intent(this,RebeccaActivity::class.java)
            startActivity(map)

        }
        au8.setOnClickListener {
            Toast.makeText(applicationContext, "You moved to author social platform", Toast.LENGTH_LONG).show()
            var map= Intent(this,MiramdaActivity::class.java)
            startActivity(map)

        }
        au9.setOnClickListener {
            Toast.makeText(applicationContext, "You moved to author social platform", Toast.LENGTH_LONG).show()
            var map= Intent(this,ReidActivity::class.java)
            startActivity(map)

        }
        au10.setOnClickListener {
            Toast.makeText(applicationContext, "You moved to author social platform", Toast.LENGTH_LONG).show()
            var map= Intent(this,TerryActivity::class.java)
            startActivity(map)

        }























    }
}