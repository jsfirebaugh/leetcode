class Solution {
    fun subtractProductAndSum(n: Int): Int {

        val numbers = n.toString().split("").toMutableList()
        numbers.removeIf{ it == "" || it == null}

        var sum: Int = 0
        var product: Int = 0

        for (index in numbers.indices){
            sum += numbers[index].toInt()

            when (index) {
                0 -> product = numbers[index].toInt()
                else -> product *= numbers[index].toInt()
            }
        }

        return product - sum
    }

    fun subtractProductAndSum2(n: Int): Int {
        val numbers = n.toString().map(Character::getNumericValue)
        var sum: Int = 0
        var product: Int = 1

        for(number in numbers) {
            sum += number
            product *= number
        }

        return product - sum
    }
}

fun main() {
    val input1: Int = 234
    val input2: Int = 4421

    val solution = Solution()

    println(solution.subtractProductAndSum(input1))
    println(solution.subtractProductAndSum(input2))
}