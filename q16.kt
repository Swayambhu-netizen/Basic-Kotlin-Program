fun main() {

    // Celsius to Fahrenheit
    print("Enter temperature in Celsius: ")
    val celsius = readLine()!!.toDouble()

    val fahrenheit = (celsius * 9 / 5) + 32

    println("Temperature in Fahrenheit = $fahrenheit")

    // Fahrenheit to Celsius
    print("Enter temperature in Fahrenheit: ")
    val fahr = readLine()!!.toDouble()

    val cel = (fahr - 32) * 5 / 9

    println("Temperature in Celsius = $cel")
}
