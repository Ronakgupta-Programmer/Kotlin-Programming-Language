import kotlin.system.exitProcess

fun main() {
    var continueGenerating: Boolean
    do {
        println("\n--- Fibonacci Series Generator ---")
        println("The Fibonacci series is a sequence where each number is the sum of the two preceding ones.")
        print("Enter the number of terms you want in the Fibonacci series (or type 'exit' to quit): ")

        val input = readLine()

        if (input.equals("exit", ignoreCase = true)) {
            println("Exiting the program. Goodbye!")
            exitProcess(0)
        }

        // Check if the input is a valid integer
        val terms = input?.toIntOrNull()

        if (terms == null || terms <= 0) {
            println("Invalid input. Please enter a positive integer.")
        } else {
            val fibonacciSeries = generateFibonacci(terms)
            println("Fibonacci Series up to $terms terms: ${fibonacciSeries.joinToString(", ")}")
        }

        print("Do you want to generate another series? (yes/no): ")
        continueGenerating = readLine()?.trim()?.equals("yes", ignoreCase = true) ?: false
    } while (continueGenerating)
}

// Function to generate Fibonacci series
fun generateFibonacci(terms: Int): List<Int> {
    val series = mutableListOf<Int>()
    var a = 0
    var b = 1

    for (i in 0 until terms) {
        series.add(a)
        val next = a + b
        a = b
        b = next
    }

    return series
}
