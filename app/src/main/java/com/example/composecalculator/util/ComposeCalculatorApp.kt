package com.example.composecalculator.util

import android.app.Application
import android.content.Context

class ComposeCalculatorApp : Application() {

//    val listModule: List<Module> = listOf(
//        apiModule,
//        viewModelModule,
//        repositoryModule,
//        networkModule,
//        //databaseModule
//    )
//
    companion object {
        private var mContext: ComposeCalculatorApp? = null

        fun getContext(): Context? {
            return mContext
        }

    }
}