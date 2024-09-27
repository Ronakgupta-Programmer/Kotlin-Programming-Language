import kotlin.system.exitProcess

fun main() {
    var continueConverting: Boolean
    do {
        println("\n--- Temperature Converter ---")
        println("Choose the conversion type:")
        println("1. Celsius to Fahrenheit")
        println("2. Fahrenheit to Celsius")
        println("3. Celsius to Kelvin")
        println("4. Kelvin to Celsius")
        println("5. Fahrenheit to Kelvin")
        println("6. Kelvin to Fahrenheit")
        println("7. Exit")
        print("Enter your choice (1-7): ")

        val choice = readLine()

        when (choice) {
            "1" -> convertCelsiusToFahrenheit()
            "2" -> convertFahrenheitToCelsius()
            "3" -> convertCelsiusToKelvin()
            "4" -> convertKelvinToCelsius()
            "5" -> convertFahrenheitToKelvin()
            "6" -> convertKelvinToFahrenheit()
            "7" -> {
                println("Exiting the program. Goodbye!")
                exitProcess(0)
            }
            else -> println("Invalid choice. Please try again.")
        }

        print("Do you want to perform another conversion? (yes/no): ")
        continueConverting = readLine()?.trim()?.equals("yes", ignoreCase = true) ?: false
    } while (continueConverting)
}

// Conversion Functions
fun convertCelsiusToFahrenheit() {
    print("Enter temperature in Celsius: ")
    val celsius = readLine()!!.toDouble()
    val fahrenheit = (celsius * 9 / 5) + 32
    println("Temperature in Fahrenheit: $fahrenheit°F")
}

fun convertFahrenheitToCelsius() {
    print("Enter temperature in Fahrenheit: ")
    val fahrenheit = readLine()!!.toDouble()
    val celsius = (fahrenheit - 32) * 5 / 9
    println("Temperature in Celsius: $celsius°C")
}

fun convertCelsiusToKelvin() {
    print("Enter temperature in Celsius: ")
    val celsius = readLine()!!.toDouble()
    val kelvin = celsius + 273.15
    println("Temperature in Kelvin: $kelvin K")
}

fun convertKelvinToCelsius() {
    print("Enter temperature in Kelvin: ")
    val kelvin = readLine()!!.toDouble()
    val celsius = kelvin - 273.15
    println("Temperature in Celsius: $celsius°C")
}

fun convertFahrenheitToKelvin() {
    print("Enter temperature in Fahrenheit: ")
    val fahrenheit = readLine()!!.toDouble()
    val kelvin = (fahrenheit - 32) * 5 / 9 + 273.15
    println("Temperature in Kelvin: $kelvin K")
}

fun convertKelvinToFahrenheit() {
    print("Enter temperature in Kelvin: ")
    val kelvin = readLine()!!.toDouble()
    val fahrenheit = (kelvin - 273.15) * 9 / 5 + 32
    println("Temperature in Fahrenheit: $fahrenheit°F")
}
