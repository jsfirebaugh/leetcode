class Solution {
    fun heightChecker(heights: IntArray): Int {

        val sortedHeights = heights.copyOf()
        sortedHeights.sort()

        var counter = 0

        for(index in 0..heights.size-1){
            if(heights[index] != sortedHeights[index]){
                counter++
            }
        }

        return counter
    }
}

fun main() {
    val solution = Solution()

    println(solution.heightChecker(intArrayOf(1,1,4,2,1,3)))
    println(solution.heightChecker(intArrayOf(5,1,2,3,4)))
}