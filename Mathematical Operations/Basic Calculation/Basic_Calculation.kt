import kotlin.system.exitProcess

fun main() {
    var continueCalculation: Boolean
    do {
        println("\n--- Basic Math Operations ---")
        println("1. Addition")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Exit")
        print("Choose an option (1-5): ")

        val choice = readLine()

        when (choice) {
            "1" -> performAddition()
            "2" -> performSubtraction()
            "3" -> performMultiplication()
            "4" -> performDivision()
            "5" -> {
                println("Exiting the program. Goodbye!")
                exitProcess(0)
            }
            else -> println("Invalid choice, please try again.")
        }

        print("Do you want to perform another calculation? (yes/no): ")
        continueCalculation = readLine()?.trim()?.equals("yes", ignoreCase = true) ?: false
    } while (continueCalculation)
}

fun performAddition() {
    print("Enter first number: ")
    val num1 = readLine()!!.toDouble()
    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()
    val result = num1 + num2
    println("Result: $num1 + $num2 = $result")
}

fun performSubtraction() {
    print("Enter first number: ")
    val num1 = readLine()!!.toDouble()
    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()
    val result = num1 - num2
    println("Result: $num1 - $num2 = $result")
}

fun performMultiplication() {
    print("Enter first number: ")
    val num1 = readLine()!!.toDouble()
    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()
    val result = num1 * num2
    println("Result: $num1 * $num2 = $result")
}

fun performDivision() {
    print("Enter first number: ")
    val num1 = readLine()!!.toDouble()
    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()
    if (num2 == 0.0) {
        println("Error: Division by zero is not allowed.")
    } else {
        val result = num1 / num2
        println("Result: $num1 / $num2 = $result")
    }
}
