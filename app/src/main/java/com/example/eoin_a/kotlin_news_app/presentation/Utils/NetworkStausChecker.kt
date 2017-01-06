package com.example.eoin_a.kotlin_news_app.presentation.Utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo


/**
 * Created by eoin_a on 06/01/2017.
 */

public interface NetworkStausChecker {
    fun checkConnected() :Boolean
}

public class NetworkStatusCheckerImp(cont : Context)  : NetworkStausChecker{

    var cm : ConnectivityManager? = null

    init {
        cm = (cont.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager)
    }

    override fun checkConnected(): Boolean {
       var activenetinfo = cm?.activeNetworkInfo
       return activenetinfo != null && activenetinfo.isConnectedOrConnecting
    }
}