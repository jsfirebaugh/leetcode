class Solution {
    fun runningSum(nums: IntArray): IntArray {
        for (index in 1 until nums.size) {
            nums[index] = nums[index] + nums[index-1]
        }

        return nums
    }
}

fun main() {
    val array1 = intArrayOf(1,2,3,4)
    val array2 = intArrayOf(1,1,1,1,1)
    val array3 = intArrayOf(3,1,2,10,1)

    val solution = Solution()
    println(solution.runningSum(array1).joinToString(","))
    println(solution.runningSum(array2).joinToString(","))
    println(solution.runningSum(array3).joinToString(","))
}