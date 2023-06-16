class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int { //var matchCount: Int = 0

        val keys = hashMapOf<String,Int>(
            "type" to 0,
            "color" to 1,
            "name" to 2
        )

        return items.count { it[keys[ruleKey]!!] == ruleValue }
    }
}

fun main() {
    val solution = Solution()

    val input1 = listOf(
        listOf<String>("phone","blue","pixel"),
        listOf<String>("computer","silver","lenovo"),
        listOf<String>("phone","gold","iphone")
    )

    println(solution.countMatches(input1, "color", "silver"))
    println(solution.countMatches(input1, "type", "phone"))
}