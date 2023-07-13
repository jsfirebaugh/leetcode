import kotlin.math.max

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var maxAvg: Double = 0.0

        for(i in 0..nums.size - k){
            when(i){
                0 -> maxAvg = nums.copyOfRange(i,i+k).sum().toDouble() / k
                else -> maxAvg = maxOf(maxAvg, nums.copyOfRange(i,i+k).sum().toDouble() / k)
            }
        }

        return maxAvg
    }
}

fun main() {
    val solution = Solution()

    val input1 = intArrayOf(1, 12, -5, -6, 50, 3)
    println(solution.findMaxAverage(input1, 4))

    val input2 = intArrayOf(5)
    println(solution.findMaxAverage(input2, 1))

    val input3 = intArrayOf(-1)
    println(solution.findMaxAverage(input3, 1))
}