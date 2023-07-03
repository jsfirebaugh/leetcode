class Solution {
    fun mergeAlternately(word1: String, word2: String): String {

        var returnString: String = ""

        for(i in 0 until maxOf(word1.length, word2.length)){
            if(word1.indices.contains(i)){
                returnString += word1[i]
            }

            if(word2.indices.contains(i)){
                returnString += word2[i]
            }
        }

        return returnString
    }
}

fun main(){
    val solution = Solution()
    println(solution.mergeAlternately("abc", "pqr"))
    println(solution.mergeAlternately("ab", "pqrs"))
    println(solution.mergeAlternately("abcd", "pq"))
}