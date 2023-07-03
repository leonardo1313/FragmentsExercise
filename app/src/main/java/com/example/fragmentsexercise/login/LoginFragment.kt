package com.example.fragmentsexercise.login

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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

            var usernameNotEmpty = false
            var passwordNotEmpty = false

            usernameText.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    Log.d("TAG", "Not implemented!")
                }

                override fun onTextChanged(
                    s: CharSequence?,
                    start: Int,
                    before: Int,
                    count: Int
                ) {
                    Log.d("TAG", "Not implemented!")
                }

                override fun afterTextChanged(s: Editable?) {
                    if (s!!.isNotEmpty()) {
                        usernameNotEmpty = true
                    }
                    if (usernameNotEmpty && passwordNotEmpty) {
                        submitBtn.isEnabled = true
                    }
                }

            })

            passwordText.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    Log.d("TAG", "Not implemented!")
                }

                override fun onTextChanged(
                    s: CharSequence?,
                    start: Int,
                    before: Int,
                    count: Int
                ) {
                    Log.d("TAG", "Not implemented!")
                }

                override fun afterTextChanged(s: Editable?) {
                    if (s!!.isNotEmpty()) {
                        passwordNotEmpty = true
                    }
                    if (usernameNotEmpty && passwordNotEmpty) {
                        submitBtn.isEnabled = true
                    }
                }

            })

            submitBtn.setOnClickListener {

                //TODO Check if username and password are nut null -> if they are not go to next screen and if there's no input display Toast message


                val intent = Intent().apply {
                    setClass(this@LoginFragment.requireContext(), MainActivity::class.java)
                }
                startActivity(intent)

//                if (usernameText.editableText.isNotEmpty() && passwordText.editableText.isNotEmpty()) {
//                    submitBtn.isEnabled = true
//                }

//                if (usernameText.editableText.isEmpty() || passwordText.editableText.isEmpty()) {
//                    Toast.makeText(
//                        requireContext(),
//                        "Enter username and/or password!",
//                        Toast.LENGTH_LONG
//                    ).show()
//                } else {
//                    val intent = Intent().apply {
//                        setClass(this@LoginFragment.requireContext(), MainActivity::class.java)
//                    }
//                    startActivity(intent)
//                }
                //To destroy activity after it's no longer visible
                //this.activity?.finish()

            }
        }

        setFragmentResult("REQUEST_KEY", bundleOf("MESSAGE" to "Welcome"))
        //Bundle(1).apply {  }

    }
}