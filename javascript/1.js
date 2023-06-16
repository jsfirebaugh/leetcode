
var twoSum = function(nums, target){
    for( a = 0; a < nums.length; a++ ){
        for( b = 0; b < nums.length; b++){
            if( a != b && nums[a] + nums[b] == target){
                return `[${a},${b}]`
            }
        }
    }
}

console.log(twoSum( [2,7,11,15], 9 ))
console.log(twoSum( [3,2,4], 6))
console.log(twoSum( [3,3], 6))