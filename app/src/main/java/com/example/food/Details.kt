package com.example.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.ImageView
import android.widget.TextView

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val food = intent.getParcelableExtra<CourseRVModal>("food")
        if (food != null) {
            val Tv = findViewById<TextView>(R.id.tv)
            val Iv: ImageView = findViewById(R.id.iv)
            Tv.text = food.courseName
            Tv.movementMethod = ScrollingMovementMethod()
            Iv.setImageResource(food.courseImg)
        }
    }
}