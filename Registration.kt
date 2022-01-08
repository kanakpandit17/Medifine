package com.geekyhub.yuiop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_registration.*


private var mFirebaseAnalytics: FirebaseAnalytics? = null

class Registration : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    lateinit var database: FirebaseDatabase
    lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        database= FirebaseDatabase.getInstance()
        databaseReference=database.getReference("BMIapp").child("users")




        val actionBar = supportActionBar

        actionBar!! .title = "Registration Page"

        val buttonP = findViewById<Button>(R.id.button4)
        buttonP.setOnClickListener {
            val Intent = Intent(this, bmi::class.java)
            startActivity(Intent)

        }



        }





}