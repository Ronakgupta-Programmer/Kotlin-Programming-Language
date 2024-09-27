import kotlin.system.exitProcess

fun main() {
    var continueCalculation: Boolean
    do {
        println("\n--- Factorial Finder ---")
        println("This program calculates the factorial of a non-negative integer.")
        print("Enter a non-negative integer (or type 'exit' to quit): ")

        val input = readLine()

        if (input.equals("exit", ignoreCase = true)) {
            println("Exiting the program. Goodbye!")
            exitProcess(0)
        }

        // Check if the input is a valid integer
        val number = input?.toIntOrNull()

        if (number == null || number < 0) {
            println("Invalid input. Please enter a non-negative integer.")
        } else {
            val result = factorial(number)
            println("Factorial of $number is $result")
        }

        print("Do you want to calculate another factorial? (yes/no): ")
        continueCalculation = readLine()?.trim()?.equals("yes", ignoreCase = true) ?: false
    } while (continueCalculation)
}

// Function to calculate factorial
fun factorial(n: Int): Long {
    return if (n == 0) 1 else n * factorial(n - 1)
}
