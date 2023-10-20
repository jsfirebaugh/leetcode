class Solution {

    private fun formatInputString(s: String): String {
        var stringToProcess = s;

        while ( stringToProcess.contains("#") ) {
            stringToProcess = when ( stringToProcess.first() == '#' ) {
                true -> stringToProcess.removePrefix("#")
                false -> {
                    val removeIndex = stringToProcess.indexOfFirst { it == '#' }
                    stringToProcess.removeRange(removeIndex - 1, removeIndex + 1)
                }
            }
        }

        return stringToProcess
    }

    fun backspaceCompare(s: String, t: String): Boolean {
        return formatInputString( s ) == formatInputString( t )
    }
}

fun main() {
    val solution = Solution()

    val input1 = "ab#c"
    val input2 = "ad#c"

    println( solution.backspaceCompare(input1, input2) )

    val input3 = "ab##"
    val input4 = "c#d#"

    println( solution.backspaceCompare(input3, input4))

    val input5 = "a#c"
    val input6 = "b"

    println( solution.backspaceCompare(input5, input6))

    val input7 = "a##c"
    val input8 = "#########"

    println( solution.backspaceCompare(input7, input8))

}