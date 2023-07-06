package com.example.bookcafeed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView

class bookshelfActivity : AppCompatActivity() {
    lateinit var book1:CardView
    lateinit var book2:CardView
    lateinit var book3:CardView
    lateinit var book4:CardView
    lateinit var book5:CardView
    lateinit var book6:CardView
    lateinit var book7:CardView
    lateinit var book8:CardView
    lateinit var book9:CardView
    lateinit var book10:CardView
    lateinit var book11:CardView
    lateinit var book12:CardView
    lateinit var book13:CardView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookshelf)

        book1=findViewById(R.id.cardBOOK1)
        book2=findViewById(R.id.cardbook2)
        book3=findViewById(R.id.cardbook3)
        book4=findViewById(R.id.cardbook4)
        book5=findViewById(R.id.cardbook5)
        book6=findViewById(R.id.cardbook6)
        book7=findViewById(R.id.cardbook7)
        book8=findViewById(R.id.cardbook8)
        book9=findViewById(R.id.cardbook9)
        book10=findViewById(R.id.cardbook10)
        book11=findViewById(R.id.cardbook11)
        book12=findViewById(R.id.cardbook12)
        book13=findViewById(R.id.cardbook13)



        book1.setOnClickListener {

            var map= Intent(this,FireActivity::class.java)
            startActivity(map)

        }




        book2.setOnClickListener {

            var map= Intent(this,seaActivity::class.java)
            startActivity(map)

        }



        book3.setOnClickListener {

            var map= Intent(this,WheelActivity::class.java)
            startActivity(map)

        }

        book4.setOnClickListener {

            var map= Intent(this,risingActivity::class.java)
            startActivity(map)

        }


        book5.setOnClickListener {

            var map= Intent(this,HeavenActivity::class.java)
            startActivity(map)

        }


        book6.setOnClickListener {

            var map= Intent(this,annaActivity::class.java)
            startActivity(map)

        }




        book7.setOnClickListener {

            var map= Intent(this,MrsActivity::class.java)
            startActivity(map)

        }

        book8.setOnClickListener {

            var map= Intent(this,JamoActivity::class.java)
            startActivity(map)

        }


        book9.setOnClickListener {

            var map= Intent(this,KiteActivity::class.java)
            startActivity(map)

        }

        book10.setOnClickListener {

            var map= Intent(this,ChancesActivity::class.java)
            startActivity(map)

        }



        book11.setOnClickListener {

            var map= Intent(this,MythologyActivity::class.java)
            startActivity(map)

        }


        book12.setOnClickListener {

            var map= Intent(this,OrderActivity::class.java)
            startActivity(map)

        }


        book13.setOnClickListener {

            var map= Intent(this,SagaActivity::class.java)
            startActivity(map)

        }









































    }





}