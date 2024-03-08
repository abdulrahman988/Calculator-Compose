package com.example.composecalculator.util.network

import kotlinx.coroutines.flow.Flow

interface ConnectivityObserver {
    fun observe() : Flow<Status>


    enum class Status {
        Available , UnAvailable ,Losing , Lost
    }
}