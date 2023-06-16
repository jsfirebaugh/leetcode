class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val answers = mutableListOf<Int>()

        for (numIndex in nums.indices) {
            answers.add(index[numIndex], nums[numIndex])
            answers.
        }

        return answers.toIntArray()
    }
}

fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(0,1,2,3,4)
    val index1 = intArrayOf(0,1,2,2,1)

    println(solution.createTargetArray(nums1, index1).joinToString())

    val nums2 = intArrayOf(1,2,3,4,0)
    val index2 = intArrayOf(0,1,2,3,0)

    println(solution.createTargetArray(nums2, index2).joinToString())

}