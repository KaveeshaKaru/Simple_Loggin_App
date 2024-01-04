package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var username : EditText
    lateinit var Password: EditText
    lateinit var LoginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val forgetTextView= findViewById<TextView>(R.id.forgetTextView)
//        forgetTextView.setOnClickListener(View.OnClickListener {
//
//            intent = Intent(this, MainActivity3::class.java)
//            startActivity(intent)
//
//        })

        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val forgetTextView = findViewById<TextView>(R.id.forgetTextView)
        forgetTextView.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        })


        binding.LoginBtn.setOnClickListener(View.OnClickListener {
            if (binding.username.text.toString() == "David Johns" && binding.Password.text.toString() == "1234"){
                Toast.makeText(this,"Login Successful!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)

            }else {
                Toast.makeText(this,"Login Failed !!", Toast.LENGTH_SHORT).show()
            }
        })




    }
}