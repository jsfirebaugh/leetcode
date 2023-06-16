var searchRange = function(nums, target){

    if (nums.indexOf(target) == -1){
        return [-1,-1]
    }

    const first = nums.indexOf(target);
    const second = nums.length - nums.reverse().indexOf(target) - 1

    return [first, second]
}

console.log( searchRange( [5,7,7,8,8,10], 8) )
console.log( searchRange( [5,7,7,8,8,10], 6) )
console.log( searchRange( [], 0) )