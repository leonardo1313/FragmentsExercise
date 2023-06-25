package com.example.fragmentsexercise.main

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainAdapter(activity: MainActivity) : FragmentStateAdapter(activity) {

    //Number of screens we want to swipe(number of fragments to swipe between)
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment =
        when(position) {
            0 -> SongsFragment()
            1 -> MoreInfoFragment()
            else -> SongsFragment()
        }
}