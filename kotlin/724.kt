class Solution {
    fun pivotIndex(nums: IntArray): Int {

        for (i in 0..nums.lastIndex) {
            val rightSum = nums.copyOfRange(0,i).sum()
            val leftSum = nums.copyOfRange(i+1, nums.size).sum()
            
            if( rightSum == leftSum ){
                return i
            }
        }

        return -1
    }
}

fun main() {
    val solution = Solution()

    val input1 = intArrayOf(1,7,3,6,5,6)
    val input2 = intArrayOf(1,2,3)
    val input3 = intArrayOf(2,1,-1)

    println(solution.pivotIndex(input1))
    println(solution.pivotIndex(input2))
    println(solution.pivotIndex(input3))
}