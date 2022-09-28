package com.example.recycleviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var list:ArrayList<Data>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = ArrayList()

        list.add(Data(R.drawable.afghanistan,"Afghanistan"))
        list.add(Data(R.drawable.argentina,"Argentina"))
        list.add(Data(R.drawable.canada,"Canada"))
        list.add(Data(R.drawable.germany,"Germany"))
        list.add(Data(R.drawable.india,"India"))
        list.add(Data(R.drawable.ireland,"Ireland"))
        list.add(Data(R.drawable.norway,"Norway"))
        list.add(Data(R.drawable.sweden,"Sweden"))
        list.add(Data(R.drawable.usa,"United States Of America"))
        list.add(Data(R.drawable.afghanistan,"Afghanistan"))
        list.add(Data(R.drawable.argentina,"Argentina"))
        list.add(Data(R.drawable.canada,"Canada"))
        list.add(Data(R.drawable.germany,"Germany"))
        list.add(Data(R.drawable.india,"India"))
        list.add(Data(R.drawable.ireland,"Ireland"))
        list.add(Data(R.drawable.norway,"Norway"))
        list.add(Data(R.drawable.sweden,"Sweden"))
        list.add(Data(R.drawable.usa,"United States Of America"))

        val adapter = AdapterClass(list)
        recycle.adapter = adapter
        recycle.layoutManager = LinearLayoutManager(this)

    }
}