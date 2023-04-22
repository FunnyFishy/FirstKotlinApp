package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


import java.util.Random

class MainActivity : AppCompatActivity() {

    private val courseList = arrayListOf("JAVA","Kotlin","PHP")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_add :Button = findViewById(R.id.btn_add)
        val tv_courselist : TextView = findViewById(R.id.tv_courselist)
//        val tv_courselist :TextView = findViewById(R.id.tv_courselist)



        btn_add.setOnClickListener{
            val random = Random()
            val randCourse = random.nextInt(courseList.count())
            //tv_courselist.setText(""+randCourse)
            tv_courselist.text = courseList[randCourse]
            println(courseList[randCourse])
        }





    }
}