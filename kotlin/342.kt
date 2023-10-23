class Solution {
    fun isPowerOfFour(n: Int): Boolean {

        if( n < 1 ) return false

        var newN = n

        while( newN > 1 ){
            if( newN % 4 != 0 ) return false
            newN = newN / 4
        }

        return true
    }
}
fun main() {
    val solution = Solution()

    println( solution.isPowerOfFour(16))
    println( solution.isPowerOfFour(5))
    println( solution.isPowerOfFour(1))
    println( solution.isPowerOfFour(0))
    println( solution.isPowerOfFour(8))
}