class Solution {
    fun differenceOfSum(nums: IntArray): Int {

        var runningSum: Int = 0

        for (num in nums) {
            runningSum += num.toString().map { it.toString().toInt() }.sum()
        }

        return nums.sum() - runningSum

    }
}

fun main(){
    val solution = Solution()

    val input1 = intArrayOf(1,15,6,3)
    println(solution.differenceOfSum(input1))

    val input2 = intArrayOf(1,2,3,4)
    println(solution.differenceOfSum(input2))
}