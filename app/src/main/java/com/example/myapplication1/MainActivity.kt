package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    lateinit var button1:Button
    lateinit var button2:Button
    lateinit var button3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.azeralmsa)
        button2 = findViewById(R.id.azkeralspah)

        button1.setOnClickListener{
            var intent  = Intent(this,azkeralmasa::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{
            var intent  = Intent(this,azkeralsaph::class.java)
            startActivity(intent)
        }


    }
}