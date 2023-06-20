class Solution {
    fun generate(numRows: Int): List<List<Int>> {

        val pascalsTriangle = mutableListOf(
            listOf(1)
        )

        for(i in 1 until numRows){
            val nextRowOfTriangle = mutableListOf<Int>(1)

            for(j in 1 until pascalsTriangle[i-1].size){
                nextRowOfTriangle.add(
                    pascalsTriangle[i-1][j-1] + pascalsTriangle[i-1][j]
                )
            }

            nextRowOfTriangle.add(1)

            pascalsTriangle.add(nextRowOfTriangle)
        }

        return pascalsTriangle
    }
}

fun main(){
    val levels: Int = 10
    val solution = Solution()
    
    for(i in 1..levels){
        println(solution.generate(i))
    }
}