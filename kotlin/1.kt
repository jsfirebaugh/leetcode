fun twoSum(nums: IntArray, target: Int): IntArray {

    for(i in nums){
        println(i)
    }

    return intArrayOf(1,2)
}

fun main() {
    println( twoSum(intArrayOf(2,7,11,15), 9).joinToString() )
}