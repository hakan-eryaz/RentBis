package com.example.rentbis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home_page.*
import kotlinx.android.synthetic.main.activity_main.*

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        val phone = intent.getStringExtra("phone")
        Toast.makeText(applicationContext, "Logged with $phone.", Toast.LENGTH_LONG).show()
        imageButton9.setOnClickListener{
            val intent= Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }
        imageButton7.setOnClickListener{
            val intent= Intent(this,UsageHistory::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener{
            val intent= Intent(this,Menu::class.java)
            startActivity(intent)
        }
        button.setOnClickListener{
            val intent= Intent(this,RentPage::class.java)

            startActivity(intent)
        }
    }
}