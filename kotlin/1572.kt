class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        var runningSum: Int = 0;

        for(i in 0..mat.lastIndex){
            runningSum += mat[i][i]

            if(i != mat.lastIndex - i){
                runningSum += mat[i][mat.lastIndex - i]
            }
        }

        return runningSum;
    }
}

fun main(){
    val solution = Solution()

    val inputs1 = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9)
    )

    val inputs2 = arrayOf(
        intArrayOf(1,1,1,1),
        intArrayOf(1,1,1,1),
        intArrayOf(1,1,1,1),
        intArrayOf(1,1,1,1)
    )

    val inputs3 = arrayOf(
        intArrayOf(5)
    )

    println(solution.diagonalSum(inputs1))
    println(solution.diagonalSum(inputs2))
    println(solution.diagonalSum(inputs3))
}