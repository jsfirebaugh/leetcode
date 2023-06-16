class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {

        val returnList : MutableList<Boolean> = MutableList(candies.size) { false }

        for (index in candies.indices) {
            if (candies[index] + extraCandies >= candies.max()!!) {
                returnList[index] = true
            }
        }

        return returnList
    }

    fun kidsWithCandies2(candies: IntArray, extraCandies: Int): List<Boolean> {

        val returnList : MutableList<Boolean> = MutableList(candies.size) { false }

        for (index in candies.indices) {
            returnList[index] = candies[index] + extraCandies >= candies.max()!!
        }

        return returnList
    }

}

fun main() {
    val solution = Solution()

    val input1 = intArrayOf(2,3,5,1,3)
    val input2 = intArrayOf(4,2,1,1,2)
    val input3 = intArrayOf(12,1,12)

    println(solution.kidsWithCandies(input1, 3).joinToString(","))
    println(solution.kidsWithCandies(input2, 1).joinToString(","))
    println(solution.kidsWithCandies(input3, 10).joinToString(","))
}