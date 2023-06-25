package com.example.fragmentsexercise.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.viewpager2.widget.ViewPager2
import com.example.fragmentsexercise.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //For working with fragment container view
        /*supportFragmentManager.commit {
            setReorderingAllowed(true)
            //add(R.id.fragment_container_view_main, SongsFragment())

            //Opening web page inside mobile app
            add(R.id.fragment_container_view_main, MoreInfoFragment())
            addToBackStack(null)
        }*/


        viewPager = findViewById(R.id.view_pager)
        viewPager.adapter = MainAdapter(this)
    }


}