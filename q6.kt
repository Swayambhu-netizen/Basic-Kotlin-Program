fun main() {
    print("Enter a number: ")
    val num = readLine()!!.toInt()

    var factorial = 1

    for (i in 1..num) {
        factorial *= i
    }

    println("Factorial = $factorial")
}
