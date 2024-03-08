package com.example.composecalculator.util

import android.content.Context
import com.example.composecalculator.util.SHARED_PREFERENCE.SHARED_PREF_FILE_NAME

class PreferencesUtils(val context: Context?) {


    private var mInstance: PreferencesUtils? = null

    @Synchronized
    fun getInstance(): PreferencesUtils? {
        if (mInstance == null) {
            mInstance = PreferencesUtils(context)
        }
        return mInstance
    }

    private val sharedPreferences =
        ComposeCalculatorApp.getContext()!!.getSharedPreferences(
            SHARED_PREF_FILE_NAME,
            Context.MODE_PRIVATE
        )


    /// Boolean
    fun putBoolean(key: String, value: Boolean) {
        sharedPreferences.edit().putBoolean(key, value).apply()
    }

    fun getBoolean(key: String): Boolean {
        return sharedPreferences.getBoolean(key, false)
    }

    /// String
    fun putString(key: String, value: String?) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String): String? {
        return sharedPreferences.getString(key, null)
    }

    fun clear() {
        sharedPreferences.edit().clear().apply()
    }
}