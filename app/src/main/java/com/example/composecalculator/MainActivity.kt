package com.example.composecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composecalculator.ui.screens.calculatorScreen.CalculatorScreen
import com.example.composecalculator.ui.screens.calculatorScreen.viewmodel.CalculatorViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = viewModel<CalculatorViewModel>()
            val state = viewModel.state

            CalculatorScreen(
                state = state,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.DarkGray)
                    .padding(16.dp),
                onAction = viewModel::onAction
            )
        }
    }
}