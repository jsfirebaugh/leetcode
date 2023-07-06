class Solution {
    fun reverseWords(s: String): String {
        return s
            .split(" ")
            .filter { it != "" }
            .reversed()
            .joinToString(" ")
    }
}

fun main() {
    val solution = Solution()

    println(solution.reverseWords("word1 word2 word3  word4"))
    println(solution.reverseWords("   word1   word2  word3  word4       "))
    println(solution.reverseWords(""))
    println(solution.reverseWords("word1"))
}