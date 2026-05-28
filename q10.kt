fun checkCharacter(ch: Char) {
    when (ch.lowercaseChar()) {
        'a', 'e', 'i', 'o', 'u' -> println("Vowel")
        else -> println("Consonant")
    }
}

fun main() {
    print("Enter a character: ")
    val ch = readLine()!![0]

    checkCharacter(ch)
}
