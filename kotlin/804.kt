class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val alphabet = "abcdefghijklmnopqrstuvwxyz";
        val morseCodeAlphabet = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
        val morseWords = mutableSetOf<String>()

        for (word in words) {
            var wordString = ""

            for (letter in word) {
                wordString += morseCodeAlphabet[alphabet.indexOf(letter)]
            }

            morseWords.add(wordString)
        }

        return morseWords.size
    }
}

fun main() {
    val solution = Solution()

    val input1 = arrayOf("gin", "zen", "gig", "msg")
    println(solution.uniqueMorseRepresentations(input1))

    val input2 = arrayOf("a")
    println(solution.uniqueMorseRepresentations(input2))
}