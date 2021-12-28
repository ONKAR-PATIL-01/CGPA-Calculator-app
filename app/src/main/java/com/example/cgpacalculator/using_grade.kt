package com.example.cgpacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class using_grade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_using_grade)

        val t1=findViewById<Spinner>(R.id.et1)
        val t2=findViewById<Spinner>(R.id.et2)
        val t3=findViewById<Spinner>(R.id.et3)
        val t4=findViewById<Spinner>(R.id.et4)
        val t5=findViewById<Spinner>(R.id.et5)
        val b1=findViewById<Button>(R.id.b1)
        val tv=findViewById<TextView>(R.id.res)



        ArrayAdapter.createFromResource(
                this,
                R.array.planets_array,
                android.R.layout.simple_spinner_item
        ).also { adapter ->

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            t1.adapter = adapter
            t2.adapter=adapter
            t3.adapter=adapter
            t4.adapter=adapter
            t5.adapter=adapter
        }


    b1.setOnClickListener {
        var  a=t1.selectedItemPosition
        var  b=t2.selectedItemPosition
        var  c=t3.selectedItemPosition
        var  d=t4.selectedItemPosition
        var  e=t5.selectedItemPosition

        when (a) {
            0 -> a=10
            1 -> a=9
            2 -> a=8
            3 -> a=7
            4 -> a=6
            5 -> a=5
            6 -> a=4
            7 -> a=0
            8 -> a=0
        }
        when (b) {
            0 -> b=10
            1 -> b=9
            2 -> b=8
            3 -> b=7
            4 -> b=6
            5 -> b=5
            6 -> b=4
            7 -> b=0
            8 -> b=0
        }
        when (c) {
            0 -> c =10
            1 -> c =9
            2 -> c =8
            3 -> c =7
            4 -> c =6
            5 -> c =5
            6 -> c =4
            7 -> c =0
            8 -> c =0
        }
        when (d) {
            0 -> d =10
            1 -> d =9
            2 -> d =8
            3 -> d =7
            4 -> d =6
            5 -> d =5
            6 -> d =4
            7 -> d =0
            8 -> d =0
        }
        when (e ) {
            0 -> e  =10
            1 -> e  =9
            2 -> e  =8
            3 -> e  =7
            4 -> e  =6
            5 -> e  =5
            6 -> e  =4
            7 -> e  =0
            8 -> e  =0
        }


        val sum=(a+b+c+d+e)/5.0
        tv.text = sum.toString()
    }


    }
}