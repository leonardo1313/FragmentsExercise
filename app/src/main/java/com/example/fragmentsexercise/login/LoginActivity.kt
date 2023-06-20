package com.example.fragmentsexercise.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentsexercise.R

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val fragmentManager = supportFragmentManager
        // create transaction
        val transaction = fragmentManager.beginTransaction()

        // set of methods we want to execute with this transaction
        transaction.apply {
            setReorderingAllowed(true)
            add(R.id.fragment_container_view, WelcomeFragment())
        }
        // all methods for transaction are defined and can be executed
        transaction.commit()
    }
}