package com.example.composecalculator.util

sealed class AppResult<out T> {

    data class Success<out T>(val successData: T) : AppResult<T>()
    class Error(
        val exception: java.lang.Exception,
        val statusCode : Int? = null,
        val error: String? = exception.localizedMessage,
    ) : AppResult<Nothing>()
}