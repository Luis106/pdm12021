package com.example.pdm12021

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.*
import android.webkit.WebView
import android.widget.Button
import android.widget.LinearLayout
import android.widget.SearchView
import androidx.activity.OnBackPressedCallback
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class WebView : AppCompatActivity() {

    private lateinit var searchView: SearchView
    private lateinit var webView: WebView
    private val BASE_URL = "HTTPS://google.com.mx"
    private val SEARCH_PATH = "search/q="
    private lateinit var swipeRefresh: SwipeRefreshLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        searchView = findViewById(R.id.searchView)
        webView = findViewById(R.id.webView)
        swipeRefresh = findViewById(R.id.swipeRefresh)

        swipeRefresh.setOnRefreshListener {
            webView.reload()
        }

        webView.webChromeClient = object : WebChromeClient(){


        }

        webView.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                return false
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                searchView.setQuery(url, false)
                swipeRefresh.isRefreshing = true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                swipeRefresh.isRefreshing = false
            }

        }

        val settings = webView.settings
        settings.javaScriptEnabled = true
        webView.loadUrl(BASE_URL)

        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                if (p0 != null) {
                    Log.d("Barra de busqueda", p0)

                    if (URLUtil.isValidUrl(p0)){
                        Log.d("URL válida.", p0)
                        webView.loadUrl("$BASE_URL$SEARCH_PATH$p0")
                    }else{
                        Log.d("No es una URL", p0)
                    }
                }
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                return false
            }
        });
    }


    fun OnBackPressed(){
        if (webView.canGoBack()){
            webView.goBack()
        }else{
            super.onBackPressed()
        }

    }


}