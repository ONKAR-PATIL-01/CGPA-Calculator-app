package com.example.cgpacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.round

class using_marks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_using_marks)
        val t1=findViewById<EditText>(R.id.et1)
        val t2=findViewById<EditText>(R.id.et2)
        val t3=findViewById<EditText>(R.id.et3)
        val t4=findViewById<EditText>(R.id.et4)
        val t5=findViewById<EditText>(R.id.et5)
        val b1=findViewById<Button>(R.id.b1)
        val tv=findViewById<TextView>(R.id.res)
        b1.setOnClickListener {
            var a=t1.text.toString().trim().toInt()
            var b=t2.text.toString().trim().toInt()
            var c=t3.text.toString().trim().toInt()
            var d=t4.text.toString().trim().toInt()
            var e=t5.text.toString().trim().toInt()
            when (a) {
                in 91..100 -> a=10
                in 81..90 -> a=9
                in 71..80 -> a=8
                in 61..70 -> a=7
                in 51..60 -> a=6
                in 41..50 -> a=5
                in 33..40 -> a=4
                in 21..32 -> a=0
                in 0..21 -> a=0
            }



            when (b) {
                in 91..100 -> b =10
                in 81..90 -> b =9
                in 71..80 -> b =8
                in 61..70 -> b =7
                in 51..60 -> b =6
                in 41..50 -> b =5
                in 33..40 -> b =4
                in 21..32 -> b =0
                in 0..21 -> b =0
            }


            when (c) {
                in 91..100 -> c  =10
                in 81..90 -> c  =9
                in 71..80 -> c  =8
                in 61..70 -> c  =7
                in 51..60 -> c  =6
                in 41..50 -> c  =5
                in 33..40 -> c  =4
                in 21..32 -> c  =0
                in 0..21 -> c  =0
            }


            when (d) {
                in 91..100 -> d  =10
                in 81..90 -> d  =9
                in 71..80 -> d  =8
                in 61..70 -> d  =7
                in 51..60 -> d  =6
                in 41..50 -> d  =5
                in 33..40 -> d  =4
                in 21..32 -> d  =0
                in 0..21 -> d  =0
            }



            when {
                e in 91..100 -> e =10
                e in 81..90 -> e=9
                e in 71..80 -> e =8
                e in 61..70 -> e=7
                e in 51..60 -> e=6
                e in 41..50 -> e=5
                e in 33..40 -> e=4
                e in 21..32 -> e=0
                b in 0..21 -> e=0
            }

            val sum=(a+b+c+d+e)/5.0
            tv.text = sum.toString()
        }

    }
}
