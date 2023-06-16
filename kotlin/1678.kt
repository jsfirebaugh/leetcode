class Solution {
    fun interpret(command: String): String {
        return command
            .replace("()", "o")
            .replace("(al)", "al")
    }
}

fun main() {
    val solution = Solution()

    val input1 = "G()(al)"
    val input2 = "G()()()()(al)"
    val input3 = "(al)G(al)()()G"

    println(solution.interpret(input1))
    println(solution.interpret(input2))
    println(solution.interpret(input3))
}