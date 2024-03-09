package com.example.composecalculator.data.db.model

sealed class CalculatorAction{
    data class Number(val number: String): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    data class Operation(val calculatorOperation: CalculatorOperation): CalculatorAction()
}
