package ni.edu.uam.testunitariopractica

class Calculadora {

        fun sumar(a: Int, b: Int): Int = a + b
        fun restar(a: Int, b: Int): Int = a - b
        fun multiplicar(a: Int, b: Int): Int = a * b
        fun dividir(a: Int, b: Int): Int {
            if (b == 0) throw IllegalArgumentException("No se puede dividir por cero")
            return a / b}
}