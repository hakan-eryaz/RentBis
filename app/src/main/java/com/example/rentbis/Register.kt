package com.example.rentbis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        save.setOnClickListener {
            val intent2= Intent(this,Congratulations::class.java)
            startActivity(intent2)
        }
        login.setOnClickListener {
            val intent2=Intent(this,MainActivity::class.java)
            startActivity(intent2)
        }
    }
}