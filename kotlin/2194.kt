class Solution {
    fun cellsInRange(s: String): List<String> {
        val returnList = mutableListOf<String>()

        for(i in s[0]..s[3]){
            for(j in s[1]..s[4]){
                returnList.add("$i$j")
            }
        }

        return returnList
    }
}

fun main(){
    val solution = Solution()

    val input1 = "K1:L2"
    val input2 = "A1:F1"
    val input3 = "A1:C5"

    println(solution.cellsInRange(input1))
    println(solution.cellsInRange(input2))
    println(solution.cellsInRange(input3))
}