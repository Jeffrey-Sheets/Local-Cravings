package com.example.localcravings

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var myViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        myViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val recyclerView = findViewById<RecyclerView>(R.id.restaurantList)
        recyclerView.adapter = MainAdapter(myViewModel.restaurant.value!!){

        }


        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun MainAdapter(restaurants: MutableList<Restaurant>): Unit {

    }

}