class Solution {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {

        val commonItems = list1.toSet().intersect(list2.toSet())
        var leastIndex: Int? = null
        var leastIndexItems = emptyArray<String>()

        commonItems.forEach { searchString ->
            val indexList1 = list1.indexOfFirst { it == searchString }
            val indexList2 = list2.indexOfFirst { it == searchString }

            if( leastIndex == null || leastIndex!! > indexList1 + indexList2  ){
                leastIndex = indexList1 + indexList2
                leastIndexItems = arrayOf(searchString)
            } else if ( leastIndex == indexList1 + indexList2 ) {
                leastIndexItems += arrayOf(searchString)
            }
        }

        return leastIndexItems
    }
}

fun main() {
    val solution = Solution()

    val input1 = arrayOf("Shogun","Tapioca Express","Burger King","KFC")
    val input2 = arrayOf("Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun")
    println( solution.findRestaurant(input1, input2).joinToString() )

    val input3 = arrayOf("Shogun","Tapioca Express","Burger King","KFC")
    val input4 = arrayOf("KFC","Shogun","Burger King")
    println( solution.findRestaurant(input3, input4).joinToString() )

    val input5 = arrayOf("happy","sad","good")
    val input6 = arrayOf("sad", "happy")
    println( solution.findRestaurant(input5, input6).joinToString() )
}