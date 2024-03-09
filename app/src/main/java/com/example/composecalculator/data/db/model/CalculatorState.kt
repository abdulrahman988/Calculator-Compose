package com.example.composecalculator.data.db.model

data class CalculatorState(
    val firstNum: String = "",
    val secondNum: String = "",
    val operation: CalculatorOperation? = null,
)
