
var runningSum = function(nums) {

    let returnArray = [];

    nums.forEach((input) => {
        currentSum = returnArray.reduce((previous,current) => {
            return previous + current;
        },0)

        returnArray.push(input + currentSum)

        console.log(returnArray);
        console.log(currentSum);
        console.log(input);
        console.log("--------------------")
    })

    /*
    let returnArray = [];
    let runningSum = 0;

    nums.forEach((input) => {
        runningSum += input;
        returnArray.push(runningSum)
    })
    */

    return returnArray;
}

console.log(runningSum([1,2,3,4]))
//console.log(runningSum([1,1,1,1,1]))
//console.log(runningSum([3,1,2,10,1]))
