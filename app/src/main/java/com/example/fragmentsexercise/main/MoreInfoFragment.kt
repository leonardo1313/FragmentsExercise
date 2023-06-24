package com.example.fragmentsexercise.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import com.example.fragmentsexercise.R

const val URL = "https://developer.android.com/"

//Opening web page inside mobile app
class MoreInfoFragment : Fragment() {

    private lateinit var webView: WebView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_more_info, container, false)
    }

    override fun onStart() {
        super.onStart()

        view?.let {
            webView = it.findViewById(R.id.web_view)
            webView.loadUrl(URL)
        }
    }

}