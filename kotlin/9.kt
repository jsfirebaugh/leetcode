
fun main() {
    println( isPalindrome(121) )
    println( isPalindrome(-121) )
    println( isPalindrome(10) )
}

fun isPalindrome(x: Int): Boolean {
    return x.toString() == x.toString().reversed()
}