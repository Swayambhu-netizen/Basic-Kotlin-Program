fun main() {
    print("Enter number of terms: ")
    val n = readLine()!!.toInt()

    var first = 0
    var second = 1

    println("Fibonacci Series:")

    for (i in 1..n) {
        print("$first ")

        val next = first + second
        first = second
        second = next
    }
}
