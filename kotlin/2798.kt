class Solution {
    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        return hours.filter { it >= target }.size
    }
}

fun main() {
    val solution = Solution()

    val input1 = intArrayOf(0,1,2,3,4)
    val target1 = 2
    val solution1 = solution.numberOfEmployeesWhoMetTarget( input1, target1 )
    println( solution1 )

    val input2 = intArrayOf(5,1,4,2,2)
    val target2 = 6
    val solution2 = solution.numberOfEmployeesWhoMetTarget( input2, target2 )
    println( solution2 )

}