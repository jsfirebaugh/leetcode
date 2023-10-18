class Solution {
    fun climbStairs(n: Int): Int {
        val fibAsList = arrayListOf(0,1)

        for( i in 1 .. n ){
            fibAsList.add( fibAsList.last() + fibAsList[fibAsList.lastIndex - 1] )
        }

        return fibAsList.last()
    }

    fun climbStairs2(n: Int): Int {
        var first = 0
        var second = 1

        for( i in 2 .. n ){
            val origFirst = first
            first = second
            second = origFirst + first
        }

        return first + second
    }
}

fun main() {

    val solution = Solution()
    println( solution.climbStairs(4))

}