
var numJewelsInStones = function(jewels, stones) {
    jewels.split("").forEach((jewel) => {
        stones = stones.replaceAll(jewel,1);
    })

    return stones.split("").filter((input) => {
        return input == 1 ? true : false
    }).length

    console.log(stones.length)
}

numJewelsInStones('aA','aAAbbbb')