import java.util.Stack

class Solution {
    fun removeStars(s: String): String {
        var returnString = Stack<Char>()

        for (character in s) {
            when (character) {
                '*' -> returnString.pop()
                else -> returnString.push(character)
            }
        }

        return returnString.joinToString("")
    }

    // this works until you get a very large input
    // then it times out
    fun removeStars_2(s: String): String {
        var returnString = ""

        for (character in s) {
            when (character) {
                '*' -> returnString = returnString.dropLast(1)
                else -> returnString += character
            }
        }

        return returnString
    }
}

fun main() {
    val solution = Solution()

    val string1 = "leet**cod*e"
    println(solution.removeStars(string1))

    val string2 = "erase*****"
    println(solution.removeStars(string2))

    var string3 = "z*z*z*z*z*z*z*z*z*x"
    println(solution.removeStars(string3))
}