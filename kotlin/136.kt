class Solution {
    fun singleNumber(nums: IntArray): Int {
        val numberList = mutableListOf<Int>()

        for(num in nums){
            if(numberList.contains(num)){
                numberList.remove(num)
            } else {
                numberList.add(num)
            }
        }

        return numberList.first()
    }
}

fun main(){
    val solution = Solution()

    val input1 = intArrayOf(2,2,1)
    val input2 = intArrayOf(4,1,2,1,2)
    val input3 = intArrayOf(1)

    println(solution.singleNumber(input1))
    println(solution.singleNumber(input2))
    println(solution.singleNumber(input3))
}