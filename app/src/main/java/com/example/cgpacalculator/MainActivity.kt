package com.example.cgpacalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var b1 = findViewById<Button>(R.id.button)
        var b2 = findViewById<Button>(R.id.button2)
        var b3 = findViewById<Button>(R.id.button3)
        b1.setOnClickListener {
           val i= Intent(this,using_marks::class.java)
            startActivity(i)
        }
        b2.setOnClickListener {
            val i= Intent(this,using_grade::class.java)
            startActivity(i)
        }
        b3.setOnClickListener {
            startActivity(Intent(this,p_to_c::class.java))
        }
    }
}