package com.example.eoin_a.kotlin_news_app.presentation.Utils

import android.content.Context
import android.content.SharedPreferences
import org.jetbrains.anko.defaultSharedPreferences

/**
 * Created by eoin_a on 06/01/2017.
 * wrapper on sharedprefs class.
 */

interface SharedPrefsHelper {

    fun getPrefsStringValue(key : String) : String
    fun addPrefsStringVal( key : String,  value: String)
    fun getSharedPrefsBool(key : String): Boolean
    fun addSharedPrefsBool(key : String, value : Boolean)


}

public class SharedPrefsHelperImp( cont : Context) : SharedPrefsHelper {

    val prefsname: String = "prefs"
    var prefs: SharedPreferences? = null
    var edit: SharedPreferences.Editor? = null


    init {
        prefs = cont.getSharedPreferences(prefsname, Context.MODE_PRIVATE)
        edit = prefs!!.edit()
    }



    override fun getPrefsStringValue(key: String) : String {
        return prefs!!.getString(key, "")
    }

     override fun addPrefsStringVal( key : String,  value: String)  {
            edit!!.putString(key, value).commit()
    }

    override fun getSharedPrefsBool(key : String): Boolean {
        return prefs!!.getBoolean(key, false)
    }

    override fun addSharedPrefsBool(key : String, value : Boolean) {
            edit!!.putBoolean(key, value).commit()
    }
}
