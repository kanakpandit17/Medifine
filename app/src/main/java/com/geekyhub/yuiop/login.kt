package com.geekyhub.yuiop

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {
    @SuppressLint("RestrictedApi")

    private lateinit var auth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth= FirebaseAuth.getInstance()


        button3.setOnClickListener{
            if(checking()){
                val email= editTextTextPersonName.text.toString()
                val password= editTextTextPassword.text.toString()
                auth.signInWithEmailAndPassword(email,password)
                    .addOnCompleteListener(this){
                    task->
                        if(task.isSuccessful)
                        {
                            Toast.makeText(this,"Successfully logged in",Toast.LENGTH_LONG).show()
                        }
                        else
                        {
                            Toast.makeText(this,"Wrong Details",Toast.LENGTH_LONG).show()
                        }
                }

            }
            else{
                Toast.makeText(this,"Enter the Details",Toast.LENGTH_LONG).show()
            }
        }









        val actionBar = supportActionBar

        actionBar!! .title = "Login Page"



        val buttonB = findViewById<Button>(R.id.button3)
        buttonB.setOnClickListener {
            val Intent = Intent(this, Registration::class.java)
            startActivity(Intent)

        }


}
    private fun checking():Boolean
    {
        if(editTextTextPersonName.text.toString().trim{it<=' '}.isNotEmpty() && editTextTextPassword.text.toString().trim{it<=' '}.isNotEmpty())
        {
            return true
        }


            return false
    }

}