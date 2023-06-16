import kotlin.math.sqrt

class Solution {
    fun mySqrt(x: Int): Int {
        return sqrt(x.toDouble()).toInt()
    }
}

fun main() {
    val solution = Solution()

    println(solution.mySqrt(4))
    println(solution.mySqrt(8))
}