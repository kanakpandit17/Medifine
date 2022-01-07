package com.geekyhub.yuiop


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_bmi.*


class bmi : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_bmi)

        val actionBar = supportActionBar

        actionBar!! .title = "BMI Calculator"

        val btnabcd = findViewById<Button>(R.id.btnabc)


        btnabcd.setOnClickListener {

            val height = findViewById<EditText>(R.id.height1234)
            val h = (height.text).toString().toFloat() /100


            val weight = findViewById<EditText>(R.id.weight1234)
            val w = weight.text.toString().toFloat()

            val res = w/(h*h)
            result.text = "%.2f".format(res)
        }







    }
}

