import java.util.Arrays;

class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int num1 = nums[nums.length - 1] - 1;
        int num2 = nums[nums.length - 2] - 1;
        return num1 * num2;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] inputs = {
                { 3, 4, 5, 2 },
                { 1, 5, 4, 5 },
                { 3, 7 }
        };

        for(int[] input : inputs){
            System.out.println(solution.maxProduct(input));
        }

    }
}