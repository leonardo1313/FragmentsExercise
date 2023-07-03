package com.example.fragmentsexercise.main

import android.content.DialogInterface
import com.example.fragmentsexercise.R


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main_toolbar)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        this.setActionBar(toolbar)

        // For working with fragment container view
        /*supportFragmentManager.commit {
            setReorderingAllowed(true)
            //add(R.id.fragment_container_view_main, SongsFragment())

            //Opening web page inside mobile app
            add(R.id.fragment_container_view_main, MoreInfoFragment())
            addToBackStack(null)
        }*/


        //ViewPager2
//        viewPager = findViewById(R.id.view_pager)
//        viewPager.adapter = MainAdapter(this)
//
//        drawerLayout = findViewById(R.id.drawer_layout)
//        navigationView = findViewById(R.id.nav_view)

        // NavigationView
//        navigationView.setNavigationItemSelectedListener { menuItem ->
//
//            // To highlight clicked item
//            menuItem.isChecked = true
//            // Hides NavigationView after item is clicked
//            drawerLayout.closeDrawers()


//            when(menuItem.itemId) {
//                R.id.import_item -> {
//                    Toast.makeText(this, "Import clicked!", Toast.LENGTH_LONG).show()
//                    Log.d("TEST_NAV", "Import clicked!")
//                }
//                R.id.gallery_item -> {
//                    Log.d("TEST_NAV", "Gallery clicked!")
//                    Toast.makeText(this, "Gallery clicked!", Toast.LENGTH_SHORT).show()
//                }
//                R.id.slide_show_item -> {
//                    Log.d("TEST_NAV", "Slideshow clicked!")
//                    Toast.makeText(this, "Slideshow clicked", Toast.LENGTH_SHORT).show()
//                }
//                R.id.tools_item -> {
//                    Log.d("TEST_NAV", "Tools clicked!")
//                    Toast.makeText(this, "Tools clicked!", Toast.LENGTH_SHORT).show()
//                }
//                else -> {
//
//                }
//            }
//            true
//        }
//        // Method for defining wat will happen when we click back button
        onBackPressedDispatcher.addCallback(object: OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if(viewPager.currentItem == 0) {
                    finish()
                } else {
                    viewPager.currentItem -= 1
                }
            }
        })
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.navigation_items, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return super.onOptionsItemSelected(item)
    }

    private fun displayDialog() {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setTitle("Dialog")
        dialogBuilder.setMessage("Do you want to change the background color to RED?")
        dialogBuilder.setPositiveButton("Yes") { dialog, which ->
            Toast.makeText(this, "Positive button clicked!", Toast.LENGTH_LONG).show()
        }
        dialogBuilder.setNegativeButton("No") { dialog, which ->
            Toast.makeText(this, "Negative button clicked!", Toast.LENGTH_LONG).show()
        }
        dialogBuilder.setNeutralButton("Cancel") { dialog, which ->
            Toast.makeText(this, "Neutral button clicked!", Toast.LENGTH_LONG).show()
        }

        val dialog = dialogBuilder.create()
        dialog.show()
    }
}