package com.example.fragmentsexercise.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import com.example.fragmentsexercise.R


class WelcomeFragment : Fragment() {

    private lateinit var loginButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onStart() {
        super.onStart()
        view?.let {
            loginButton = it.findViewById(R.id.login_btn)
            loginButton.setOnClickListener {
                val fragmentManager = parentFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.apply {
                    setReorderingAllowed(true)
                    add(R.id.fragment_container_view, LoginFragment())
                    addToBackStack(null)
                }
                transaction.commit()
            }
        }

        setFragmentResultListener("REQUEST_KEY") { requestKey, bundle ->
            var message = bundle.getString("MESSAGE")
            Log.d("RECEIVED_MESSAGE", message ?: "")
        }
    }
}