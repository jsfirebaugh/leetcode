class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        return sentence.toSet().size == 26
    }
}
fun main(){
    val solution = Solution()

    println(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))
    println(solution.checkIfPangram("leetcode"))
}