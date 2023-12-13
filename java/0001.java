import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] results = {};

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == target - nums[i] ){
                    results = new int[]{i,j};
                    return results;
                }
            }
        }

        return results;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println(Arrays.toString(result1));

        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println(Arrays.toString(result2));

        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println(Arrays.toString(result3));
    }
}