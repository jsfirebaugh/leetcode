import java.lang.NumberFormatException
import kotlin.math.absoluteValue

class Solution {
    fun reverse(x: Int): Int {
        return try {
            val reversedX = x.absoluteValue.toString().reversed().toInt()
            if( x < 0 ){
                reversedX * -1
            } else {
                reversedX
            }
        } catch (e : NumberFormatException){
            0
        }
    }
}

fun main() {
    val solution = Solution()

    val input1 = 123
    val result1 = solution.reverse( input1 )
    println( result1 )

    val input2 = -123
    val result2 = solution.reverse( input2 )
    println( result2 )

    val input3 = 120
    val result3 = solution.reverse( input3 )
    println( result3 )

    val input4 = 1534236469
    val result4 = solution.reverse( input4 )
    println( result4 )

}