package com.digitalent.anime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Detail : AppCompatActivity() {

    lateinit var judul: TextView
    lateinit var judulAnime: TextView
    lateinit var sinopsis: TextView
    lateinit var rating: TextView
    lateinit var jumlahEps: TextView
    lateinit var studios: TextView
    lateinit var back: Button
    lateinit var imageAnime: ImageView

    fun initComponents(){
        judul = findViewById(R.id.T_judul)
        judulAnime = findViewById(R.id.judul_anime)
        sinopsis = findViewById(R.id.action_sinopsis)
        rating = findViewById(R.id.rating)
        jumlahEps = findViewById(R.id.jumlah_eps)
        studios = findViewById(R.id.studio)
        back = findViewById(R.id.btn_back)
        imageAnime = findViewById(R.id.image_anime)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initComponents()

        back.setOnClickListener {
            finish()
        }

        judul.text = "Detail Anime"

        try {
            var bundle: Bundle? = intent.extras
            if (bundle != null){
                judulAnime.text = bundle.getString("judulAnime")
                sinopsis.text = bundle.getString("sinopsis")
                rating.text = bundle.getString("rating")
                jumlahEps.text = bundle.getString("episodes")
                studios.text = bundle.getString("studios")
                imageAnime.setImageResource(bundle.getInt("photo"))
            }
        }catch (ex: Exception){

        }
    }
}