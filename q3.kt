fun sum(n: Int): Int {
    var total = 0

    for (i in 1..n) {
        total += i
    }

    return total
}

fun main() {
    print("Enter N: ")
    val n = readLine()!!.toInt()

    println("Sum = ${sum(n)}")
}
