class Solution {
    fun sortSentence(s: String): String {
        val inputStringAsArray = s.split(" ").toTypedArray()
        val returnStringArray = inputStringAsArray.copyOf()

        for(i in inputStringAsArray) {
            returnStringArray[i.last().toString().toInt() - 1] = i.dropLast(1)
        }

        return returnStringArray.joinToString(" ")
    }
}

fun main(){
    val solution = Solution()

    val input1 = "is2 sentence4 This1 a3"
    val input2 = "Myself2 Me1 I4 and3"

    println(solution.sortSentence(input1))
    println(solution.sortSentence(input2))
}