package com.example.login

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton

class MainActivity3 : AppCompatActivity() {



    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val fallImg = findViewById<ImageView>(R.id.fallImg)

        val shakeAnimation = AnimatorInflater.loadAnimator(this, R.anim.shake_animation) as AnimatorSet

        // Set the target view for the animation
        shakeAnimation.setTarget(fallImg)

        // Start the animation
        shakeAnimation.start()


        val sendBtn = findViewById<AppCompatButton>(R.id.sendBtn)
        sendBtn.setOnClickListener{
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

    }
}