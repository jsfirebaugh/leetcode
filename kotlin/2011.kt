class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var returnValue = 0

        for(operation in operations){
            when (operation[1]) {
                '+' -> returnValue++
                else -> returnValue--
            }
        }

        return returnValue
    }
}

fun main() {
    val solution = Solution()

    val set1 = arrayOf("--X","X++","X++")
    val set2 = arrayOf("++X","++X","X++")

    println( solution.finalValueAfterOperations(set1))
    println( solution.finalValueAfterOperations(set2))
}