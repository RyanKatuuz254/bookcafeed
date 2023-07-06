package com.example.bookcafeed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity2 : AppCompatActivity() {
    lateinit var myemail: EditText
    lateinit var mypassword: EditText
    lateinit var mycofpassword: EditText
    lateinit var mylogin: TextView
    lateinit var mysignup: Button
    lateinit var auth: FirebaseAuth //creating firebase Authentification

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        myemail=findViewById(R.id.email)
        mypassword=findViewById(R.id.Password)
        mycofpassword=findViewById(R.id.confirmPassword)
        mylogin=findViewById(R.id.text)
        mysignup=findViewById(R.id.btnsign)
        auth = Firebase.auth

        mylogin.setOnClickListener {
            val intent= Intent( this, loginActivity::class.java )
            startActivity(intent)
            finish()
        }

        mysignup.setOnClickListener {
            signUpUser()
        }



    }

    private fun signUpUser() {
        val email=myemail.text.toString()
        val pass=mypassword.text.toString()
        val confirmpass=mycofpassword.text.toString()


        if(email.isBlank() || pass.isBlank() ||confirmpass.isBlank()){
            Toast.makeText(this,"Email and password cannot be empty", Toast.LENGTH_LONG).show()
            return


        }
        else if (pass  !=confirmpass){
            Toast.makeText(this,"passwords do not match", Toast.LENGTH_SHORT).show()
            return
        }
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if (it.isSuccessful){
                Toast.makeText(this,"sign up succesfull", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"failed to create", Toast.LENGTH_SHORT).show()
            }

        }
    }


























}
