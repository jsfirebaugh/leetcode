class Solution {
    fun countPairs(nums: List<Int>, target: Int): Int {
        var targetCount = 0

        for (i in 0 until nums.lastIndex ){
            for( j in i + 1..nums.lastIndex){
                if( nums[i] + nums[j] < target ) {
                    targetCount += 1
                }
            }
        }

        return targetCount
    }

    fun countPairsV2(nums: List<Int>, target: Int): Int {
        val numsList = nums.toMutableList()
        var resultsCount = 0

        while(numsList.isNotEmpty()){
            val firstNumber = numsList.removeFirst()
            resultsCount += numsList.count { it + firstNumber < target  }
        }

        return resultsCount
    }
}

fun main() {
    val solution = Solution()

    val input1 = listOf(-1,1,2,3,1)
    val target1 = 2
    val solution1 = solution.countPairs(input1, target1)
    val solution1v2 = solution.countPairsV2(input1, target1)
    println( solution1 )
    println( solution1v2 )

    val input2 = listOf(-6,2,5,-2,-7,-1,3)
    val target2 = -2
    val solution2 = solution.countPairs(input2, target2)
    val solution2v2 = solution.countPairsV2(input2, target2)
    println( solution2 )
    println( solution2v2)

}