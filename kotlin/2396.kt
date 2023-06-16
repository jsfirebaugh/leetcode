class Solution {
    fun isStrictlyPalindromic(n: Int): Boolean {

        for (x in 2..n-1) {
            if (n.toString(x) != n.toString(x).reversed()) {
                return false
            }
        }

        return true
    }
}

fun main() {
    val solution = Solution()

    println(solution.isStrictlyPalindromic(9))
    println(solution.isStrictlyPalindromic(4))
    println(solution.isStrictlyPalindromic(1))

}