class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {

        val occuranceArray = mutableListOf<Int>()

        for(number in arr.toSet()){
            occuranceArray.add( arr.filter { it == number }.size )
        }

        return arr.toSet().size == occuranceArray.toSet().size
    }
}

fun main() {
    val solution = Solution()
    
    val input1 = intArrayOf(1,2,2,1,1,3)
    val input2 = intArrayOf(1,2)

    println(solution.uniqueOccurrences(input1))
    println(solution.uniqueOccurrences(input2))
}