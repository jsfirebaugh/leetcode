class Solution {
    fun moveZeroes(nums: IntArray): Unit {

        var zeroCounter: Int = 0

        for(i in nums.indices){
            if(nums[i] != 0){
                nums[zeroCounter++] = nums[i]
            }
        }

        for(j in zeroCounter..nums.lastIndex){
            nums[j] = 0
        }

        println(nums.joinToString(","))
    }
}

fun main() {
    val solution = Solution()

    solution.moveZeroes(intArrayOf(0,1,0,3,12))
    solution.moveZeroes(intArrayOf(0))
    solution.moveZeroes(intArrayOf(0,0,0,0,0,1,2,3,4,5))
}