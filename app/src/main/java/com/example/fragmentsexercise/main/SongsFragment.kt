package com.example.fragmentsexercise.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentsexercise.R

class SongsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    private var songs = listOf("Bon Jovi - Have a nice day", "Three Days Grace - So called life", "AC/DC - Rock ´n roll train",
                                "Guns ´n Roses - Sweet child o mine", "Bon Jovi - Livin on a prayer", "Evanescence - Bring me to life",
                                "Linkin Park - From the inside", "Limp Bizkit - Take a look around", "Foo Fighters - Pretender",
                                "Papa Roach - Last Resort", "Bullet for my Valentine - Tears don˝t fall")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_songs, container, false)
    }

    override fun onStart() {
        super.onStart()
        view?.let {
            recyclerView = it.findViewById(R.id.recycler_view)
            recyclerView.adapter= SongsAdapter(songs)
        }
    }
}