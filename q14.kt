fun isPrime(num: Int): Boolean {

    if (num < 2)
        return false

    for (i in 2 until num) {
        if (num % i == 0)
            return false
    }

    return true
}

fun main() {
    print("Enter N: ")
    val n = readLine()!!.toInt()

    println("Prime numbers from 1 to $n are:")

    for (i in 1..n) {
        if (isPrime(i)) {
            println(i)
        }
    }
}
