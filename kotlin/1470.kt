class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val returnValues = mutableListOf<Int>()

        for (i in 0..n-1) {
            returnValues.add(nums[i])
            returnValues.add(nums[i + n])
        }

        return returnValues.toIntArray()
    }
}

fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(2,5,1,3,4,7)
    println(solution.shuffle(nums1, 3).joinToString(","))

    val nums2 = intArrayOf(1,2,3,4,4,3,2,1)
    println(solution.shuffle(nums2, 4).joinToString(","))

    val nums3 = intArrayOf(1,1,2,2)
    println(solution.shuffle(nums3, 2).joinToString(","))
}