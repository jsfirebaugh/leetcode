class Solution {
    fun vowelStrings(words: Array<String>, left: Int, right: Int): Int {
        val regexPattern = Regex("[aeiou]")
        val matchingWords = words.slice(left..right).filter {
            regexPattern.matches(it.first().toString()) && regexPattern.matches(it.last().toString())
        }
        return matchingWords.size
    }
}

fun main() {
    val solution = Solution()

    println(solution.vowelStrings(arrayOf("are", "amy", "u"), 0, 2))
    println(solution.vowelStrings(arrayOf("hey","aeo","mu","ooo","artro"), 1, 4))
    println(solution.vowelStrings(arrayOf("vo","j","i","s","i"),0,3))
}