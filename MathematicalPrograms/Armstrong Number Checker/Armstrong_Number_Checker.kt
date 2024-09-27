import kotlin.system.exitProcess

fun main() {
    var continueChecking: Boolean
    do {
        println("\n--- Armstrong Number Checker ---")
        println("An Armstrong number (or narcissistic number) is a number that is equal to the sum of its own digits raised to the power of the number of digits.")
        print("Enter a number (or type 'exit' to quit): ")

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
            if (isArmstrong(number)) {
                println("$number is an Armstrong number.")
            } else {
                println("$number is not an Armstrong number.")
            }
        }

        print("Do you want to check another number? (yes/no): ")
        continueChecking = readLine()?.trim()?.equals("yes", ignoreCase = true) ?: false
    } while (continueChecking)
}

// Function to check if a number is an Armstrong number
fun isArmstrong(number: Int): Boolean {
    val digits = number.toString().map { it.toString().toInt() }
    val numberOfDigits = digits.size
    val sumOfPowers = digits.sumOf { it.toDouble().pow(numberOfDigits).toInt() }
    return sumOfPowers == number
}
