package com.digitalent.anime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var rvAnime: RecyclerView
    private val list = ArrayList<Data>()

    fun initComponents(){
        rvAnime = findViewById(R.id.rv_anime)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        rvAnime.setHasFixedSize(true)
        list.addAll(AnimeData.listData)

//        showRecyclerCardView()
        showRecycleListView()
    }

    private fun showRecyclerCardView() {
        rvAnime.layoutManager = LinearLayoutManager(this)
        val cardViewAdapter = CardViewAdapter(list)
        rvAnime.adapter = cardViewAdapter
    }

    private fun showRecycleListView() {
        rvAnime.layoutManager = LinearLayoutManager(this)
        val listViewAdapter = ListViewAdapter(list)
        rvAnime.adapter = listViewAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.about_me -> {
                val moveAboutMe = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(moveAboutMe)
            }
            R.id.card_view -> {
                showRecyclerCardView()
            }
            R.id.list_view -> {
                showRecycleListView()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}