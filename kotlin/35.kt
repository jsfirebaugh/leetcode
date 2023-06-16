class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var mySet = nums.toMutableSet()
        mySet.add(target)
        mySet = mySet.toSortedSet()

        return mySet.indexOf(target)
    }
}

fun main() {

    var input1 = intArrayOf(1,3,5,6)
    var input2 = intArrayOf(1,3,5,6)
    var input3 = intArrayOf(1,3,5,6)

    val solution = Solution()

    println(solution.searchInsert(input1, 5))
    println(solution.searchInsert(input2, 2))
    println(solution.searchInsert(input3, 7))
}