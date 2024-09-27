import kotlin.system.exitProcess

fun main() {
    var continueChecking: Boolean
    do {
        println("\n--- Palindrome Checker ---")
        println("A palindrome is a word, phrase, number, or other sequence of characters which reads the same forward and backward (ignoring spaces, punctuation, and capitalization).")
        print("Enter a string (or type 'exit' to quit): ")

        val input = readLine()

        if (input.equals("exit", ignoreCase = true)) {
            println("Exiting the program. Goodbye!")
            exitProcess(0)
        }

        // Check if the input is valid
        if (input.isNullOrEmpty()) {
            println("Invalid input. Please enter a non-empty string.")
        } else {
            val isPalindrome = checkPalindrome(input)
            if (isPalindrome) {
                println("\"$input\" is a palindrome.")
            } else {
                println("\"$input\" is not a palindrome.")
            }
        }

        print("Do you want to check another string? (yes/no): ")
        continueChecking = readLine()?.trim()?.equals("yes", ignoreCase = true) ?: false
    } while (continueChecking)
}

// Function to check if a string is a palindrome
fun checkPalindrome(input: String): Boolean {
    val cleanedInput = input.replace(Regex("[^A-Za-z0-9]"), "").lowercase()
    return cleanedInput == cleanedInput.reversed()
}
