var removeDuplicates = function(nums) {
    for(i = 1; i < nums.length; i++){
        if(nums[i] == nums[i-1]){
            nums.splice(i,1)
            i--
        }
    }

    return nums.length;
};

const input1 = [1,1,2];
const input2 = [0,0,1,1,1,2,2,3,3,4]

console.log(removeDuplicates(input1))
console.log(removeDuplicates(input2))