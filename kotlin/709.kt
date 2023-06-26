class Solution {
    fun toLowerCase(s: String): String {
        return s.lowercase()
    }
}

fun main(){
    val solution = Solution()
    println(solution.toLowerCase("Hello"))
    println(solution.toLowerCase("here"))
    println(solution.toLowerCase("LOVELY"))
}