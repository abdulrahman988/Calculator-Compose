package com.example.composecalculator.ui.screens.calculatorScreen.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.composecalculator.data.db.model.CalculatorAction
import com.example.composecalculator.data.db.model.CalculatorOperation
import com.example.composecalculator.data.db.model.CalculatorState

class CalculatorViewModel : ViewModel() {
    fun onAction(action: CalculatorAction) {
        when(action){
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Operation -> enterOperation(action.calculatorOperation)
            is CalculatorAction.Calculate -> performCalculation()
            is CalculatorAction.Delete -> performDeletion()
        }
    }

    private fun enterOperation(operation: CalculatorOperation) {


    }

    private fun enterNumber(number: String) {


    }

    private fun enterDecimal() {


    }

    private fun performCalculation() {


    }

    private fun performDeletion() {


    }

    var state by mutableStateOf(CalculatorState())
        private set
}