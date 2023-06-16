class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {

        val returnArray = mutableListOf<Int>()

        for(i in nums.indices step 2){
            repeat(nums[i]) {
                returnArray.add(nums[i+1])
            }
        }

        return returnArray.toIntArray()
    }
}

fun main() {
    val solution = Solution()

    val inputs1 = intArrayOf(1,2,3,4)
    val inputs2 = intArrayOf(1,1,2,3)

    println(solution.decompressRLElist(inputs1).joinToString(","))
    println(solution.decompressRLElist(inputs2).joinToString(","))
}