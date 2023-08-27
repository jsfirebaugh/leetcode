
class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minimumPrice = prices[0]
        var maxProfit = 0

        for (i in 1 until prices.size){
            if (minimumPrice > prices[i]){
                minimumPrice = prices[i]
            }

            if (maxProfit < (prices[i] - minimumPrice)){
                maxProfit = prices[i] - minimumPrice
            }
        }

        return maxProfit
    }
}

fun main() {
    val solution = Solution()

    val input1 = intArrayOf(7,1,5,3,6,4)
    val input2 = intArrayOf(7,6,4,3,1)

    println(solution.maxProfit(input1))
    println(solution.maxProfit(input2))
}