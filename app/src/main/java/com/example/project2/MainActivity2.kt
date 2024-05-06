package com.example.project2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private var feedCounter = 0
    private var cleanCounter = 0
    private var happyCounter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val feedButton = findViewById<Button>(R.id.feedButton)
        val happyButton = findViewById<Button>(R.id.happyButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)

        val feedEditText = findViewById<EditText>(R.id.feedEditText)
        val cleanEditText = findViewById<EditText>(R.id.cleanEditText)
        val happyEditText = findViewById<EditText>(R.id.happyEditText)

        val imageView2: ImageView = findViewById(R.id.imageView2)

        feedButton.setOnClickListener {
            // Increment counter and update EditText
            feedCounter++
            feedEditText.setText(feedCounter.toString())

            // Change ImageView to show image for "Feed"
            imageView2.setImageResource(R.drawable.img_2)
        }

        cleanButton.setOnClickListener {
            // Increment counter and update EditText
            cleanCounter++
            cleanEditText.setText(cleanCounter.toString())

            // Change ImageView to show image for "Clean"
            imageView2.setImageResource(R.drawable.img_1)
        }

        happyButton.setOnClickListener {
            // Increment counter and update EditText
            happyCounter++
            happyEditText.setText(happyCounter.toString())

            // Change ImageView to show image for "Happy"
            imageView2.setImageResource(R.drawable.img)
        }
    }
}
