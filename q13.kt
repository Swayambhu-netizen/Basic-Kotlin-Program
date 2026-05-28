fun simpleInterest(p: Double, r: Double, t: Double): Double {
    return (p * r * t) / 100
}

fun main() {
    print("Enter Principal Amount: ")
    val p = readLine()!!.toDouble()

    print("Enter Rate of Interest: ")
    val r = readLine()!!.toDouble()

    print("Enter Time: ")
    val t = readLine()!!.toDouble()

    println("Simple Interest = ${simpleInterest(p, r, t)}")
}
