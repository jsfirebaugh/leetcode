class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        var returnString: String = ""

        for (index in indices.indices) {
            returnString += s[indices.indexOf(index)]
        }

        return returnString
    }
}

fun main() {
    val solution = Solution()

    val input1 = "codeleet"
    val input2 = intArrayOf(4,5,6,7,0,2,1,3)

    println(solution.restoreString(input1, input2))

    val input3 = "abc"
    val input4 = intArrayOf(0,1,2)

    println(solution.restoreString(input3, input4))

    val input5 = "bcdea"
    val input6 = intArrayOf(1,2,3,4,0)

    println(solution.restoreString(input5, input6))
}