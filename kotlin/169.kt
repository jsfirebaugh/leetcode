class Solution {
    fun majorityElement(nums: IntArray): Int {

        var numberSet = nums.toSet()
        var maxItem = 0
        var maxItemCount = 0

        for (number in numberSet) {
            if( nums.count { it == number } > maxItemCount ) {
                maxItem = number
                maxItemCount = nums.count { it == number }
            }
        }

        return maxItem;
    }
}

fun main() {
    val solution = Solution()

    val input1 = intArrayOf(3,2,3)
    val input2 = intArrayOf(2,2,1,1,1,2,2)

    println(solution.majorityElement(input1))
    println(solution.majorityElement(input2))
}