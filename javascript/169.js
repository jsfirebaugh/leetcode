var majorityElement = function(nums) {
    const uniqueItems = [...new Set(nums)]
    let maxItem = 0;
    let maxItemCount = 0;

    uniqueItems.forEach((element) => {
        const MatchingElements = nums.filter(num => num == element)
        if(MatchingElements.length > maxItemCount){
            maxItem = element
            maxItemCount = MatchingElements.length
        }
    })

    return maxItem

}

majorityElement([3,2,3])

console.log("---------------")
console.log("---------------")

majorityElement([2,2,1,1,1,2,2])