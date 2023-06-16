class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        var returnArray = mutableListOf<Int>()

        for(num in nums) {
            returnArray.add(nums.filter { it < num }.size)
        }

        return returnArray.toIntArray()
    }
}

fun main() {
    val solution = Solution()
    val input1 = intArrayOf(8,1,2,2,3)
    val input2 = intArrayOf(6,5,4,8)

    println(solution.smallerNumbersThanCurrent(input1).joinToString(","))
    println(solution.smallerNumbersThanCurrent(input2).joinToString(","))
}