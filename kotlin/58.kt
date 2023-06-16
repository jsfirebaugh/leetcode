class Solution {
    fun lengthOfLastWord(s: String): Int {
        val regexToReplaceMultipleSpaces = Regex("\\s+")
        return s
            .trim()
            .replace(regexToReplaceMultipleSpaces, " ")
            .split(" ")
            .last()
            .length
    }
}

fun main() {
    val solution = Solution()

    val input1 = "Hello World"
    val input2 = "    fly me     to    the moon  "
    val input3 = "luffy is still joyboy"
    val input4 = "a"

    println(solution.lengthOfLastWord(input1))
    println(solution.lengthOfLastWord(input2))
    println(solution.lengthOfLastWord(input3))
    println(solution.lengthOfLastWord(input4))
}