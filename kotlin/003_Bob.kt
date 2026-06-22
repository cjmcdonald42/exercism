object Bob {
    fun hey(input: String): String {
        // 1. Clean up the input by removing leading and trailing spaces
        val trimmed = input.trim()

        // 2. Define the different states of the input
        val isSilence = trimmed.isEmpty()
        val isQuestion = trimmed.endsWith("?")

        // Yelling means it has upper case letters, but NO lower case letters (e.g., "123" is not yelling)
        val isYelling = trimmed.any { it.isLetter() } && trimmed.all { !it.isLowerCase() }

        // 3. Match against Bob's behavioral rules
        return when {
            isSilence -> "Fine. Be that way!"
            isYelling && isQuestion -> "Calm down, I know what I'm doing!"
            isYelling -> "Whoa, chill out!"
            isQuestion -> "Sure."
            else -> "Whatever."
        }
    }
}