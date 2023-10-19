class Solution {
    fun plusOne(digits: IntArray): IntArray {

        for ( i in digits.lastIndex downTo 0 ){
            if ( digits[i] != 9 ){
                digits[i] = digits[i] + 1
                return digits
            }

            digits[i] = 0
        }

        return intArrayOf(1) + digits
    }
}

fun main() {
    val input1 = intArrayOf(1,2,3)
    val input2 = intArrayOf(4,3,2,1)
    val input3 = intArrayOf(9)
    val input4 = intArrayOf(1,9)

    val solution = Solution()
    println( solution.plusOne(input1).joinToString(",") )
    println( solution.plusOne(input2).joinToString(",") )
    println( solution.plusOne(input3).joinToString(",") )
    println( solution.plusOne(input4).joinToString(",") )
}