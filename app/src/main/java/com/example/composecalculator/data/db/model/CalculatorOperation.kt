package com.example.composecalculator.data.db.model

sealed class CalculatorOperation(val text: String) {

    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")
}
