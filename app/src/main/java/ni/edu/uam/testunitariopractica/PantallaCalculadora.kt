package ni.edu.uam.testunitariopractica

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaCalculadora() {
    val calculadora = Calculadora()
    var resultado by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {

        // Fila 1: Suma y Resta
        Row {
            Button(
                onClick = {
                    resultado = calculadora.sumar(5, 3).toString()
                }
            ) {
                Text("Sumar")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(
                onClick = {
                    resultado = calculadora.restar(5, 3).toString()
                }
            ) {
                Text("Restar")
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Fila 2: Multiplicación y División
        Row {
            Button(
                onClick = {
                    resultado = calculadora.multiplicar(5, -3).toString()
                }
            ) {
                Text("Multiplicar")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(
                onClick = {
                    resultado = try {
                        calculadora.dividir(6, 3).toString()
                    } catch (e: IllegalArgumentException) {
                        "Error: ${e.message}"
                    }
                }
            ) {
                Text("Dividir")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Texto que muestra el resultado
        Text(
            text = "Resultado: $resultado",
            fontSize = 20.sp,
            modifier = Modifier.testTag("resultado")
        )
    }
}
