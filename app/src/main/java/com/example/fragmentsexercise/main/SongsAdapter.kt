package com.example.fragmentsexercise.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.fragmentsexercise.R

class SongsAdapter(private val songs: List<String>) : RecyclerView.Adapter<SongViewHolder>() {

    //creating instance of ViewHolder class
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        var view = layoutInflater.inflate(R.layout.item_song, parent, false) as TextView
        return SongViewHolder(view)
    }

    override fun getItemCount(): Int = songs.size

    //binding list element with row on screen
    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val songElement = songs[position]
        holder.bind(songElement)
    }
}

//itemView -> a row of list layout
class SongViewHolder(itemView: TextView) : ViewHolder(itemView) {

    // songName -> each individual part of a row
    private val songName: TextView = itemView.findViewById(R.id.song_name_tv)

    fun bind(song: String) {
        songName.text = song
    }
}