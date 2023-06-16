
fun getConcatenation(nums: IntArray): IntArray {
    val mergeArray: IntArray = nums + nums
    return mergeArray
}

fun main() {
    var nums = intArrayOf(1,2,1)
    println(getConcatenation(nums).joinToString())

    nums = intArrayOf(1,3,2,1)
    println(getConcatenation(nums).joinToString())
}