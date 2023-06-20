class Solution {
    fun generate(numRows: Int): List<List<Int>> {

        // root of the triangle
        val pascalsTriangle = mutableListOf(
            listOf(1)
        )

        // start building additional rows
        for(i in 1 until numRows){

            // start a new row, rows always start with 1
            val nextRowOfTriangle = mutableListOf<Int>(1)

            // loop over the previous row starting at the 2nd index
            for(j in 1 until pascalsTriangle[i-1].size){

                // add the value of the previous index and the current and add to the new row
                nextRowOfTriangle.add(
                    pascalsTriangle[i-1][j-1] + pascalsTriangle[i-1][j]
                )
            }

            //rows always end with 1
            nextRowOfTriangle.add(1)

            // add the new row to the triangle
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