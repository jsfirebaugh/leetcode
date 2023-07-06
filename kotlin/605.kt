class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {

        val startingFlowers = flowerbed.sum()

        for(i in flowerbed.indices){
            when(i){
                0 -> {
                    if (flowerbed.size == 1 || flowerbed[i+1] == 0) {
                        flowerbed[i] = 1
                    }
                }

                flowerbed.lastIndex -> {
                    if (flowerbed[i-1] == 0) {
                        flowerbed[i] = 1
                    }
                }

                else -> {
                    if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                        flowerbed[i] = 1
                    }
                }
            }
        }

        return flowerbed.sum() - startingFlowers >= n
    }
}

fun main(){
    val solution = Solution()

    println(solution.canPlaceFlowers(intArrayOf(1,0,0,0,1), 1))
    println(solution.canPlaceFlowers(intArrayOf(1,0,0,0,1), 2))
    println(solution.canPlaceFlowers(intArrayOf(0,0,1,0,1), 1))
    println(solution.canPlaceFlowers(intArrayOf(1), 0))
    println(solution.canPlaceFlowers(intArrayOf(), 0))
    println(solution.canPlaceFlowers(intArrayOf(), 1))
}