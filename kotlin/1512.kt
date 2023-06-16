class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var returnCount = 0

        for (i in 0..nums.lastIndex) {
            for (j in i + 1..nums.lastIndex) {
                if (nums[i] == nums[j]) {
                    returnCount++
                }
            }
        }

        return returnCount
    }
}

fun main() {
    val solution = Solution()

    val input1 = intArrayOf(1,2,3,1,1,3)
    val input2 = intArrayOf(1,1,1,1)
    val input3 = intArrayOf(1,2,3)

    println(solution.numIdenticalPairs(input1))
    println(solution.numIdenticalPairs(input2))
    println(solution.numIdenticalPairs(input3))
}