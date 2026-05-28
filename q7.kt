fun largest(a: Int, b: Int, c: Int): Int {
    return maxOf(a, b, c)
}

fun main() {
    print("Enter three numbers: ")

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println("Largest = ${largest(a, b, c)}")
}
