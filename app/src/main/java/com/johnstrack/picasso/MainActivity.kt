package com.johnstrack.picasso

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val images = arrayListOf("http://i.imgur.com/DvpvklR.png",
            "http://i.imgur.com/DvpvklR.png",
            "http://i.imgur.com/DvpvklR.png")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ImagesAdapter(this, images)
        val layoutManager = GridLayoutManager(this, 2)
        gridView.adapter = adapter
        gridView.layoutManager = layoutManager
    }
}