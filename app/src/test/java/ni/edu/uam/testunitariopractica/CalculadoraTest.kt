package ni.edu.uam.testunitariopractica

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculadoraTest {

    private val calculadora = Calculadora()

    @Test
    fun verificarResta() {
        assertEquals(2, calculadora.restar(5, 3))
    }

    @Test
    fun verificarMultiplicacion() {
        assertEquals(15, calculadora.multiplicar(5, 3))
    }

    @Test
    fun verificarDivision() {
        assertEquals(2, calculadora.dividir(6, 3))
    }

    @Test
    fun verificarNumerosNegativos() {
        assertEquals(-2, calculadora.sumar(-5, 3))
        assertEquals(15, calculadora.multiplicar(-5, -3))
    }

    @Test
    fun pruebaSumaCorrecta() {
        assertEquals(8, calculadora.sumar(5, 3))
    }
}
