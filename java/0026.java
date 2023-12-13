import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {

        int uniqueInts = nums.length == 0 ? 0 : 1;

        System.out.println("Start: " + Arrays.toString(nums));

        for(int i : nums){
            if(i > nums[uniqueInts - 1]){
                nums[uniqueInts] = i;
                uniqueInts++;
            }
        }

        System.out.println("End: " + Arrays.toString(nums));

        return uniqueInts;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] inputs = {
            { 1, 1, 2 },
            { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 },
            { -3, -1, 0, 0, 0, 3, 3 }
        };

        for(int[] input : inputs){
            int result = solution.removeDuplicates(input);
            System.out.println(result);
            System.out.println("----------------------");
        }
    }
}