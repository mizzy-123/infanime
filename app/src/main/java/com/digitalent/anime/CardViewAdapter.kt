package com.digitalent.anime

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewAdapter(val listAnime: ArrayList<Data>) : RecyclerView.Adapter<CardViewAdapter.cardViewHolder>() {

    inner class cardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imgPhoto: ImageView = itemView.findViewById(R.id.item_photo)
        val animeName: TextView = itemView.findViewById(R.id.item_name)
        val sinopsis: TextView = itemView.findViewById(R.id.sinopsis)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewAdapter.cardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return cardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewAdapter.cardViewHolder, position: Int) {
        val anime = listAnime[position]

        Glide.with(holder.itemView.context)
            .load(anime.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.animeName.text = anime.name
        holder.sinopsis.text = anime.sinopsis

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Detail::class.java)
            intent.putExtra("judulAnime", anime.name)
            intent.putExtra("sinopsis", anime.sinopsis)
            intent.putExtra("photo", anime.photo)
            intent.putExtra("rating", anime.rating)
            intent.putExtra("episodes", anime.tEpisodes)
            intent.putExtra("studios", anime.studio)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return listAnime.size
    }
}