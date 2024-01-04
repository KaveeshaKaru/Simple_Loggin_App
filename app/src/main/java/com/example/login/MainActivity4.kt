package com.example.login

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val imageView3: ImageView = findViewById(R.id.imageView3)

        // Load the floating animation from the XML resource file
        val floatingAnimation = AnimatorInflater.loadAnimator(this, R.anim.floating_animation) as AnimatorSet

        // Set the target view for the animation
        floatingAnimation.setTarget(imageView3)

        // Start the animation
        floatingAnimation.start()


    }
}