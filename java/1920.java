import java.util.Arrays;

class Solution {
    public int[] buildArray(int[] nums) {
        int[] returnArray = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            returnArray[i] = nums[nums[i]];
        }

        return returnArray;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input1 = { 0, 2, 1, 5, 3, 4 };
        int[] result1 = solution.buildArray(input1);
        System.out.println(Arrays.toString(result1));

        int[] input2 = { 5, 0, 1, 2, 3, 4 };
        int[] result2 = solution.buildArray(input2);
        System.out.println(Arrays.toString(result2));
    }
}