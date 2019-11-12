package com.epicdelia.coderswag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.epicdelia.coderswag.Adapters.CategoryAdapter
import com.epicdelia.coderswag.Adapters.CategoryRecycleAdapter
import com.epicdelia.coderswag.Models.Categories
import com.epicdelia.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.Categories)
        categoryListview.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListview.layoutManager = layoutManager
        categoryListview.setHasFixedSize(true)
    }
}
