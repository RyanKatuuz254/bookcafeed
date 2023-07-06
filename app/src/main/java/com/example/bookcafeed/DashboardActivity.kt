package com.example.bookcafeed

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class DashboardActivity : AppCompatActivity() {
    lateinit var authors: CardView
    lateinit var bookshelf:CardView
    lateinit var logout:CardView
    lateinit var about:TextView





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        authors= findViewById(R.id.cardAuthors)
        bookshelf=findViewById(R.id.cardbookshelf)
        logout=findViewById(R.id.cardlogout)
        about=findViewById(R.id.about)


        authors.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked the authors page", Toast.LENGTH_LONG).show()
            var map= Intent(this,authorsActivity::class.java)
            startActivity(map)

        }


        bookshelf.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked the bookshelf", Toast.LENGTH_LONG).show()
            var map= Intent(this,bookshelfActivity::class.java)
            startActivity(map)

        }


        logout.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Logout", Toast.LENGTH_LONG).show()
            var box= AlertDialog.Builder(this)

            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCCED", DialogInterface.OnClickListener { dialog, id -> finish()  })
            box.setNegativeButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var alert=box.create()
            alert.setTitle("Bookcafeed app")
            alert.show()
        }


        about.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked the about page.", Toast.LENGTH_LONG).show()
            var map= Intent(this,linkpagesActivity::class.java)
            startActivity(map)

        }
















    }
}