class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val list1 = nums1.filter { it !in nums2 }.distinct()
        val list2 = nums2.filter { it !in nums1 }.distinct()

        return listOf(list1, list2)
    }
}

fun main() {
    val solution = Solution()

    val input1 = intArrayOf(1,2,3)
    val input2 = intArrayOf(2,4,6)

    println(solution.findDifference(input1, input2))

    val input3 = intArrayOf(1,2,3,3)
    val input4 = intArrayOf(1,1,2,2)

    println(solution.findDifference(input3, input4))
}