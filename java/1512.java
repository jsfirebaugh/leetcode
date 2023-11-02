class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                goodPairs += nums[i] == nums[j] ? 1 : 0;
            }
        }

        return goodPairs;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input1 = { 1, 2, 3, 1, 1, 3 };
        int result1 = solution.numIdenticalPairs(input1);
        System.out.println(result1);

        int[] input2 = { 1, 1, 1, 1 };
        int result2 = solution.numIdenticalPairs(input2);
        System.out.println(result2);

        int[] input3 = { 1, 2, 3 };
        int result3 = solution.numIdenticalPairs(input3);
        System.out.println(result3);
    }
}