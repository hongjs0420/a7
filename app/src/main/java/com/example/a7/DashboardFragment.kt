package com.example.a7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

import androidx.fragment.app.Fragment

import com.example.a7.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val myWebView: WebView = binding.webView

        myWebView.settings.run {
            // 웹뷰 자바스크립트 허용
            this.javaScriptEnabled = true
            this.javaScriptCanOpenWindowsAutomatically = true
            setSupportMultipleWindows(true)
        }



        myWebView.webViewClient = WebViewClient()
        myWebView.webChromeClient = WebChromeClient()
        myWebView.loadUrl("http://www.prowa.co.kr/buy/write")



        return root
    }


}