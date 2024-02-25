package com.digitalent.anime

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutMe : AppCompatActivity() {

    lateinit var image: ImageView

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        supportActionBar?.title = "About Me"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        image = findViewById(R.id.image)

        image.setImageDrawable(resources.getDrawable(R.drawable.foto_saya))
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}