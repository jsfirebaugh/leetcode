class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        return word1.joinToString("") == word2.joinToString("")
    }
}
fun main() {
    val solution = Solution()

    val array1 = arrayOf<String>("ab","c")
    val array2 = arrayOf<String>("a","bc")
    println(solution.arrayStringsAreEqual(array1, array2))

    val array3 = arrayOf<String>("a","cb")
    val array4 = arrayOf<String>("ab","c")
    println(solution.arrayStringsAreEqual(array3, array4))

    val array5 = arrayOf<String>("abc","d", "defg")
    val array6 = arrayOf<String>("abcddefg")
    println(solution.arrayStringsAreEqual(array5, array6))
}