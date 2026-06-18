import org.w3c.dom.ranges.Range
object Bob {
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
}
