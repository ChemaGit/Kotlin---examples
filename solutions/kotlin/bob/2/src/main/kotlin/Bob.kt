/**
 * Usamos 'object' en lugar de 'class' para crear un Singleton.
 * Esto significa que Kotlin creará una única instancia de 'Bob' automáticamente,
 * ideal para clases de utilidad o funciones puras como esta.
 */
object Bob {

    fun hey(input: String): String {
        // .trim() elimina los espacios en blanco, tabuladores (\t) y saltos de línea (\n, \r)
        // que se encuentren al inicio y al final de la cadena de texto.
        val trimmed = input.trim()

        // 1. CONDICIONES COMPLEMENTARIAS (Abstracción de la lógica)

        // Comprueba si el texto está completamente vacío tras el trim (Silencio).
        val isSilence = trimmed.isEmpty()

        // Comprueba si el último carácter es un signo de interrogación (Pregunta).
        val isQuestion = trimmed.endsWith("?")

        // Comprueba si el usuario está gritando. Para que sea un grito real:
        // - .any { it.isLetter() } asegura que haya al menos una letra (evita que "123!" sea un grito).
        // - trimmed == trimmed.uppercase() verifica que todo lo que sean letras esté en mayúsculas.
        val isYelling = trimmed.any { it.isLetter() } && trimmed == trimmed.uppercase()

        // 2. ESTRUCTURA DE CONTROL 'when'
        // En Kotlin, 'when' sustituye al 'switch' de Java, pero funciona como una expresión.
        // Evalúa las condiciones de arriba hacia abajo y devuelve el resultado de la primera que sea 'true'.
        return when {
            // Caso 1: No dice nada
            isSilence -> "Fine. Be that way!"

            // Caso 2: Grita y además hace una pregunta (Orden importante: el caso más específico va primero)
            isYelling && isQuestion -> "Calm down, I know what I'm doing!"

            // Caso 3: Solo grita
            isYelling -> "Whoa, chill out!"

            // Caso 4: Solo pregunta
            isQuestion -> "Sure."

            // Caso por defecto: Cualquier otra interacción (Equivalente al 'else' o 'default')
            else -> "Whatever."
        }
    }
}

/*object Bob {
    fun hey(input: String): String {
        //TODO("Implement the function to complete the task")
        val CAPITALS = """[A-Z]+""".toRegex()
        val SPECIAL_CHARS = """[\t][\r][\n]+""".toRegex()
        if (input.replace(" ", "")
            .replace("\t", "")
            .replace("\r", "")
            .replace("\n", "")
            .isEmpty()) {
            return "Fine. Be that way!"
        } else if(input.contentEquals(input.uppercase()) && input.endsWith("?") && input.contains(CAPITALS)) {
            return "Calm down, I know what I'm doing!"
        } else if(input.replace(" ", "").endsWith("?")) {
            return "Sure."
        } else if(input.contentEquals(input.uppercase()) && input.contains(CAPITALS)) {
            return "Whoa, chill out!"
        } else {
            return "Whatever."
        }
    }
} */
