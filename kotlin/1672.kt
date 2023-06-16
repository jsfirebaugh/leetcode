class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {

        var maxWealth: Int = 0

        for (account in accounts) {
            if (account.sum() > maxWealth) {
                maxWealth = account.sum()
            }
        }

        return maxWealth;
    }
}

fun main() {

    var input1 = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(3,2,1)
    )

    var input2 = arrayOf(
        intArrayOf(1,5),
        intArrayOf(7,3),
        intArrayOf(3,5)
    )

    var solution = Solution()
    println(solution.maximumWealth(input1))
    println(solution.maximumWealth(input2))

}