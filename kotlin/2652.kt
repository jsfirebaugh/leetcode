class Solution {
    fun sumOfMultiples(n: Int): Int {

        var nSum: Int = 0

        for(i in 1..n){
            if( i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                nSum += i
            }
        }

        return nSum
    }
}

fun main(){
    val solution = Solution()

    println( solution.sumOfMultiples(7) )
    println( solution.sumOfMultiples(10) )
}