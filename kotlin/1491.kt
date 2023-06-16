class Solution {
    fun average(salary: IntArray): Double {
        val newArray = salary.toMutableList()
        newArray.sort()
        newArray.removeFirst()
        newArray.removeLast()
        return newArray.average()
    }
}
fun main() {
    val solution = Solution()

    val inputs1 = intArrayOf(4000,3000,1000,2000)
    val inputs2 = intArrayOf(1000,2000,3000)

    println(solution.average(inputs1))
    println(solution.average(inputs2))
}