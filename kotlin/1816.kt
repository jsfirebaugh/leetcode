class Solution {
    fun truncateSentence(s: String, k: Int): String {
        return s.split(" ").slice(0..k - 1).joinToString(" ")
    }
}

fun main() {
    val solution = Solution()

    val result1 = solution.truncateSentence("this is a whole sentence", 3)
    println(result1)

    val result2 = solution.truncateSentence("this is a much longer sentence and there are more words", 5)
    println(result2)
}