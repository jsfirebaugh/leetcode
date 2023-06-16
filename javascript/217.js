

var containsDuplicate = function(nums) {

    let foundMatch = false;
    for(i = 0; i < nums.length; i++){
        matchingNums = nums.filter(matchNum => {
            return nums[i] == matchNum
        });

        if(matchingNums.length > 1){
            foundMatch = true;
            break;
        }
    }

    return foundMatch
    
    /*
    var foundMatch = false;

    nums.forEach((num) => {
        matchingNums = nums.filter(matchNum => {
            return num == matchNum
        });

        if(matchingNums.length > 1){
            foundMatch = true
        }
    })

    return foundMatch
    */
}

const inputs = [
    [1,2,3,1],
    [1,2,3,4],
    [1,1,1,3,3,4,3,2,4,2]
]

inputs.forEach((input) => {
    console.log(containsDuplicate(input))
})