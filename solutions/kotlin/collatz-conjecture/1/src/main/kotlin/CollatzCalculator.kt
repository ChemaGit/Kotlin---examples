object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        // 1. VALIDACIÓN INICIAL (Principio Fail Fast)
        // 'require' es una función nativa de Kotlin. Si la condición es falsa,
        // lanza automáticamente un 'IllegalArgumentException' con el mensaje que se defina.
        require(start > 0) { "Solo se permiten enteros positivos mayores a 0" }

        // En Kotlin no es obligatorio poner ': Int' si el compilador ya sabe que es un entero.
        var countSteps = 0
        var currentNumber = start

        // 2. BUCLE PRINCIPAL
        // Si 'start' es 1, la condición '1 != 1' es falsa inmediatamente.
        // El bucle no se ejecuta y devuelve 'countSteps' con valor 0.
        while (currentNumber != 1) {
            // En Kotlin, 'if-else' es una EXPRESIÓN (devuelve un valor).
            // Podemos asignar el resultado directamente a la variable.
            currentNumber = if (currentNumber % 2 == 0) {
                currentNumber / 2
            } else {
                currentNumber * 3 + 1
            }

            countSteps++ // Incrementamos el contador
        }

        return countSteps
    }
}
