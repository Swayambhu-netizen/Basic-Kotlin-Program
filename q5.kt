fun main() {
    print("Enter a number: ")
    var num = readLine()!!.toInt()

    val original = num
    var reverse = 0

    while (num != 0) {
        val digit = num % 10
        reverse = reverse * 10 + digit
        num /= 10
    }

    if (original == reverse)
        println("Palindrome Number")
    else
        println("Not a Palindrome Number")
}
