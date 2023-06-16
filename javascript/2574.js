
var leftRightDifference = function(nums) {
    let leftSum = [0]

    for(i = 0; i < nums.length - 1; i++){
        leftSum.push( leftSum[i] + nums[i] )
    }
}

leftRightDifference([10,4,8,3])
//leftRightDifference([1])