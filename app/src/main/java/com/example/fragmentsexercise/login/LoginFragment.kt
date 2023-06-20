package com.example.fragmentsexercise.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import com.example.fragmentsexercise.main.MainActivity
import com.example.fragmentsexercise.R

class LoginFragment : Fragment() {

    private lateinit var usernameText: EditText
    private lateinit var passwordText: EditText
    private lateinit var submitBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onStart() {
        super.onStart()
        view?.let {
            usernameText = it.findViewById(R.id.username_tv)
            passwordText = it.findViewById(R.id.password_tv)
            submitBtn = it.findViewById(R.id.submit_btn)

            submitBtn.setOnClickListener {
                Log.d("CHECK", "username = ${usernameText.editableText} password = ${passwordText.editableText}")

                val intent = Intent().apply {
                    setClass(this@LoginFragment.requireContext(), MainActivity::class.java)
                }
                startActivity(intent)
            }
        }

        setFragmentResult("REQUEST_KEY", bundleOf("MESSAGE" to "Welcome"))
        //Bundle(1).apply {  }
    }
}