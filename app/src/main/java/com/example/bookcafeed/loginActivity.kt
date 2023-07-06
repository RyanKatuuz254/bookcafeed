package com.example.bookcafeed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class loginActivity : AppCompatActivity() {

    private lateinit var myemail: EditText
    private lateinit var mypassword1: EditText
    lateinit var login1: Button
    lateinit var signup: TextView
    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        myemail=findViewById(R.id.myemail)
        mypassword1=findViewById(R.id.ourPassword)
        login1=findViewById(R.id.login1)
        signup=findViewById(R.id.login2)
        auth= FirebaseAuth.getInstance()




        login1.setOnClickListener {
            login()
        }

        signup.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    private fun login(){
        val email= myemail.text.toString()
        val pass= mypassword1.text.toString()


        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if (it.isSuccessful) {
                Toast.makeText(this, "successfully logged in", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
            } else
                Toast.makeText(this,"log in failed", Toast.LENGTH_SHORT).show()

        }


    }





















    }
