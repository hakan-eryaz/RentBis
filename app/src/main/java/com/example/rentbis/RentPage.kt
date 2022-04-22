package com.example.rentbis

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home_page.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.login
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_rent_page.*


class RentPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rent_page)
        var bikenumber=1
        var time=1
        radiogroup.setOnCheckedChangeListener {radiogroup,i->
            var rb1:RadioButton=findViewById<RadioButton>(i)
            if(rb1!=null){
                bikenumber=rb1.text[0].toString().toInt()
                textView12.setText((time*bikenumber).toString())
            }


        }
        RadioGroup.setOnCheckedChangeListener { RadioGroup, i->
            var rb2:RadioButton=findViewById<RadioButton>(i)
            if(rb2!=null){
                time=rb2.text[0].toString().toInt()
                textView12.setText((time*bikenumber).toString())
            }
        }

        button3.setOnClickListener {
            val intent2= Intent(this,AddCredit::class.java)
            startActivity(intent2)
        }
    }

}