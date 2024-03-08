package com.example.composecalculator.util

//Splash
object Splash {
    const val SPLASH_DELAY_TIME: Long = 2000L
}

//SHARED PREFERENCE
object SHARED_PREFERENCE {
    const val LAUNCH_BEFORE = "launched-before"
    const val SHARED_PREF_FILE_NAME = "com.example.composecalculator"
    const val LANGUAGE_KEY = "language_key"
}


object USER_DATA {
    const val AUTHORIZATION = "Authorization"
    const val BEARER = "Bearer "

    @JvmField
    var CURRENT_USER_ID: String = "current-user-id"
    var CURRENT_USER_TOKEN: String = "current-user-token"

    @JvmField
    var IS_USER_SUBSCRIBED: Boolean? = null

}