package com.example.anmaksimov.homework

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        val myImage = findViewById<ImageView>(R.id.my_image)
        myImage.setImageResource(R.drawable.koala)
    }
}