package com.example.fragmentsexercise.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.example.fragmentsexercise.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        supportFragmentManager.commit {
            setReorderingAllowed(true)
            //add(R.id.fragment_container_view_main, SongsFragment())

            //Opening web page inside mobile app
            add(R.id.fragment_container_view_main, MoreInfoFragment())
            addToBackStack(null)
        }


    }


}