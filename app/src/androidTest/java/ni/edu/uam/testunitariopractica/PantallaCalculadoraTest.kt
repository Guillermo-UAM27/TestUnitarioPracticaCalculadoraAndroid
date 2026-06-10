package ni.edu.uam.testunitariopractica

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class PantallaCalculadoraTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun verificarSuma() {
        // 1. Cargar la interfaz en el entorno de pruebas
        composeTestRule.setContent {
            PantallaCalculadora()
        }

        // 2. Buscar el botón "Sumar" y hacer clic (5 + 3)
        composeTestRule
            .onNodeWithText("Sumar")
            .performClick()

        // 3. Verificar que el texto del resultado sea el esperado
        composeTestRule
            .onNodeWithTag("resultado")
            .assertTextEquals("Resultado: 8")
    }

    @Test
    fun verificarResta() {
        composeTestRule.setContent {
            PantallaCalculadora()
        }

        // Buscar el botón "Restar" y hacer clic (5 - 3)
        composeTestRule
            .onNodeWithText("Restar")
            .performClick()

        composeTestRule
            .onNodeWithTag("resultado")
            .assertTextEquals("Resultado: 2")
    }

    @Test
    fun verificarMultiplicacion() {
        composeTestRule.setContent {
            PantallaCalculadora()
        }

        // Buscar el botón "Multiplicar" y hacer clic (5 * -3)
        composeTestRule
            .onNodeWithText("Multiplicar")
            .performClick()

        composeTestRule
            .onNodeWithTag("resultado")
            .assertTextEquals("Resultado: -15")
    }

    @Test
    fun verificarDivision() {
        composeTestRule.setContent {
            PantallaCalculadora()
        }

        // Buscar el botón "Dividir" y hacer clic (6 / 3)
        composeTestRule
            .onNodeWithText("Dividir")
            .performClick()

        composeTestRule
            .onNodeWithTag("resultado")
            .assertTextEquals("Resultado: 2")
    }
}
