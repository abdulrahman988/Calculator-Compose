package com.example.composecalculator.ui.screens.calculatorScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecalculator.data.db.model.CalculatorAction
import com.example.composecalculator.data.db.model.CalculatorOperation
import com.example.composecalculator.data.db.model.CalculatorState
import com.example.composecalculator.ui.composables.CalculatorButton


@Composable
fun CalculatorScreen(
    state: CalculatorState,
    modifier: Modifier,
    onAction: (CalculatorAction) -> Unit,
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = state.firstNum + state.operation?.text + state.secondNum,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    text = "AC",
                    modifier = modifier
                        .weight(2f)
                        .background(Color.LightGray),
                    onClick = { onAction(CalculatorAction.Clear) }
                )
                CalculatorButton(
                    text = "Del",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.LightGray),
                    onClick = { onAction(CalculatorAction.Delete) }
                )
                CalculatorButton(
                    text = "/",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.Yellow),
                    onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Divide)) }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    text = "7",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.DarkGray),
                    onClick = { onAction(CalculatorAction.Number("7")) }
                )
                CalculatorButton(
                    text = "8",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.DarkGray),
                    onClick = { onAction(CalculatorAction.Number("8")) }
                )
                CalculatorButton(
                    text = "9",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.DarkGray),
                    onClick = { onAction(CalculatorAction.Number("9")) }
                )
                CalculatorButton(
                    text = "x",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.Yellow),
                    onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Multiply)) }
                )
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    text = "4",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.DarkGray),
                    onClick = { onAction(CalculatorAction.Number("4")) }
                )
                CalculatorButton(
                    text = "5",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.DarkGray),
                    onClick = { onAction(CalculatorAction.Number("5")) }
                )
                CalculatorButton(
                    text = "6",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.DarkGray),
                    onClick = { onAction(CalculatorAction.Number("6")) }
                )
                CalculatorButton(
                    text = "-",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.Yellow),
                    onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Subtract)) }
                )
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    text = "1",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.DarkGray),
                    onClick = { onAction(CalculatorAction.Number("1")) }
                )
                CalculatorButton(
                    text = "2",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.DarkGray),
                    onClick = { onAction(CalculatorAction.Number("2")) }
                )
                CalculatorButton(
                    text = "3",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.DarkGray),
                    onClick = { onAction(CalculatorAction.Number("3")) }
                )
                CalculatorButton(
                    text = "+",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.Yellow),
                    onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Add)) }
                )
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    text = "0",
                    modifier = modifier
                        .weight(2f)
                        .background(Color.DarkGray),
                    onClick = { onAction(CalculatorAction.Number("0")) }
                )
                CalculatorButton(
                    text = ".",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.DarkGray),
                    onClick = { onAction(CalculatorAction.Decimal) }
                )
                CalculatorButton(
                    text = "=",
                    modifier = modifier
                        .weight(1f)
                        .background(Color.Yellow),
                    onClick = { onAction(CalculatorAction.Calculate) }
                )
            }



        }
    }
}
