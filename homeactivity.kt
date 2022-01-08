package com.geekyhub.yuiop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button

class homeactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeactivity)

        val buttonA = findViewById<Button>(R.id.button1)
        buttonA.setOnClickListener {
            val Intent = Intent(this, login::class.java)
            startActivity(Intent)

        }
    }
}