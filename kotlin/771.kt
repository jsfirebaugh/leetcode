fun main() {
    println(numJewelsInStones("aA", "aAAbbbb"))
    println(numJewelsInStones("z", "ZZ"))
}

fun numJewelsInStones(jewels: String, stones: String): Int {
    
    var breakStone = stones

    for(letter in jewels){
        breakStone = breakStone.replace(letter.toString(), "", false)
    }

    return stones.length - breakStone.length
}