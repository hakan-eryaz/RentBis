package com.example.rentbis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        save.setOnClickListener{
            val phone=editTextPhone.text.toString()
        val intent=Intent(this,HomePage::class.java)
            intent.putExtra("phone",phone)
            if(phone.length==10) {
                startActivity(intent)
            }else if(phone.length>10 ||phone.length<10){
                Toast.makeText(applicationContext, "10 basamaklı telefon numarası girmelisiniz.", Toast.LENGTH_LONG).show()
            }
        }
        login.setOnClickListener {
            val intent2=Intent(this,Register::class.java)
            startActivity(intent2)
        }

    }
}