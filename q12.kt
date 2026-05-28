fun main() {

    // Using third variable
    var a = 10
    var b = 20

    println("Before Swapping:")
    println("a = $a")
    println("b = $b")

    val temp = a
    a = b
    b = temp

    println("After Swapping using third variable:")
    println("a = $a")
    println("b = $b")

    // Without using third variable
    var x = 5
    var y = 15

    println("Before Swapping:")
    println("x = $x")
    println("y = $y")

    x = x + y
    y = x - y
    x = x - y

    println("After Swapping without third variable:")
    println("x = $x")
    println("y = $y")
}
