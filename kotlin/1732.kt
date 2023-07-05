class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var highestAltitude: Int = 0

        gain.forEachIndexed { index, _ ->  highestAltitude = maxOf(highestAltitude, gain.copyOfRange(0,index+1).sum()) }

        return highestAltitude
    }

    fun largestAltitude_v2(gain: IntArray): Int {
        var highestAltitude: Int = 0
        var currentAltitude: Int = 0

        gain.forEach {
            currentAltitude += it
            highestAltitude = maxOf(highestAltitude, currentAltitude)
        }

        return highestAltitude
    }

    fun largestAltitude_v3(gain: IntArray): Int {
        var highestAltitude: Int = 0
        var currentAltitude: Int = 0

        for(i in gain.indices){
            currentAltitude += gain[i]
            highestAltitude = maxOf(currentAltitude, highestAltitude)
        }

        return highestAltitude
    }
}

fun main(){
    val solution = Solution()

    val input1 = intArrayOf(-5,1,5,0,-7)
    val input2 = intArrayOf(-4,-3,-2,-1,4,3,2)
    val input3 = intArrayOf(44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81)

    println(solution.largestAltitude(input1))
    println(solution.largestAltitude(input2))
    println(solution.largestAltitude(input3))

    println("----------------")

    println(solution.largestAltitude_v2(input1))
    println(solution.largestAltitude_v2(input2))
    println(solution.largestAltitude_v2(input3))

    println("----------------")

    println(solution.largestAltitude_v3(input1))
    println(solution.largestAltitude_v3(input2))
    println(solution.largestAltitude_v3(input3))
}