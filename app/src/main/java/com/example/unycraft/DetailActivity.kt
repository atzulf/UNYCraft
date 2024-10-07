package com.example.unycraft

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Ambil referensi view
        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDescription: TextView = findViewById(R.id.tv_item_description)

        // Ambil data dari Intent
        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")  // Ambil deskripsi dari intent
        val photo = intent.getIntExtra("photo", 0)

        // Set data ke TextView dan ImageView
        tvName.text = name
        tvDescription.text = description
        imgPhoto.setImageResource(photo)
    }
}
