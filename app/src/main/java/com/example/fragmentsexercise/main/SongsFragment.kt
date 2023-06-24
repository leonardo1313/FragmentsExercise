package com.example.fragmentsexercise.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentsexercise.R

class SongsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    private var songs = listOf("Bon Jovi - Have a nice day", "Three Days Grace - So called life", "AC/DC - Rock ´n roll train",
                                "Guns ´n Roses - Sweet child o mine", "Bon Jovi - Livin on a prayer", "Evanescence - Bring me to life",
                                "Linkin Park - From the inside", "Limp Bizkit - Take a look around", "Foo Fighters - Pretender",
                                "Papa Roach - Last Resort", "Bullet for my Valentine - Tears don˝t fall", "AC/DC - Highway to Hell",
                                "Foo Fighters - Best of You", "Limp Bizkit - My Way", "Halestorm - I miss the Misery")

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

            //Divider for rows in RecyclerView
            val divider = DividerItemDecoration(requireContext(), LinearLayout.VERTICAL)
            ContextCompat.getDrawable(requireContext(), R.drawable.divider)
                ?.let { it1 -> divider.setDrawable(it1) }
            recyclerView.addItemDecoration(divider)
        }
    }
}