package com.example.amit_app_1

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.amit_app_1.R.layout.activity_main
import com.example.amit_app_1.databinding.ActivityMainBinding
import android.animation.Animator
import android.view.animation.AnimationUtils

class MainActivity : AppCompatActivity() {

    private lateinit var displayImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the ImageView
        displayImage = findViewById(R.id.displayImage)

        // Find the buttons by ID
        val buttonUSA: Button = findViewById(R.id.buttonUSA)
        val buttonTX: Button = findViewById(R.id.buttonTX)
        val buttonUNT: Button = findViewById(R.id.buttonUNT)


        // Set the click listeners for each button
        buttonUSA.setOnClickListener {
            displayImage.setImageResource(R.drawable.usa_flag)
        }

        buttonTX.setOnClickListener {
            displayImage.setImageResource(R.drawable.tx_flag)
            //fadeImageChange(R.drawable.green_icon)
        }

        buttonUNT.setOnClickListener {
            displayImage.setImageResource(R.drawable.unt_flag)
        }
    }
   }
