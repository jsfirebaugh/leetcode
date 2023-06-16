var singleNonDuplicate = function(nums) {

    if(nums.length == 1){
        return nums[0]
    }

    if(nums[0] != nums[1]){
        return nums[0]
    }

    for(i=1; i < nums.length; i++){
        
        
        if( nums[i] != nums[i-1] && nums[i] != nums[i+1] ){
            return nums[i]
        }
    }

}

singleNonDuplicate([1,1,2,3,3,4,4,8,8])
console.log("-------------------------")
console.log("-------------------------")
singleNonDuplicate([3,3,7,7,10,11,11])