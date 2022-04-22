package com.example.rentbis

import CustomAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view

        data.add(ItemsViewModel(androidx.appcompat.R.drawable.abc_ic_arrow_drop_right_black_24dp, "How does it work?"))
        data.add(ItemsViewModel(androidx.appcompat.R.drawable.abc_ic_arrow_drop_right_black_24dp, "Prices"))
        data.add(ItemsViewModel(androidx.appcompat.R.drawable.abc_ic_arrow_drop_right_black_24dp, "Announcements"))
        data.add(ItemsViewModel(androidx.appcompat.R.drawable.abc_ic_arrow_drop_right_black_24dp, "Help"))
        data.add(ItemsViewModel(androidx.appcompat.R.drawable.abc_ic_arrow_drop_right_black_24dp, "About"))
        data.add(ItemsViewModel(androidx.appcompat.R.drawable.abc_ic_arrow_drop_right_black_24dp, "Provision History"))
        data.add(ItemsViewModel(androidx.appcompat.R.drawable.abc_ic_arrow_drop_right_black_24dp, "Account Activities"))
        data.add(ItemsViewModel(androidx.appcompat.R.drawable.abc_ic_arrow_drop_right_black_24dp, "Coupons"))
        data.add(ItemsViewModel(androidx.appcompat.R.drawable.abc_ic_arrow_drop_right_black_24dp, "Contracts"))


        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}