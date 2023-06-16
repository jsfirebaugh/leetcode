
var searchInsert = function(nums, target){
    if(nums.indexOf(target) != -1){
        return nums.indexOf(target)
    }

    if(nums[0] > target){
        return 0
    }

    for(i = 0; i <= nums.length; i++){
        if( target > nums[i] && target < nums[i+1] ){
            return i+1
        }
    }

    return nums.length
}

console.log(searchInsert( [1,3,5,6], 5))
console.log(searchInsert( [1,3,5,6], 2))
console.log(searchInsert( [1,3,5,6], 7))
console.log(searchInsert( [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15], 16))