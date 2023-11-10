import java.util.Arrays;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] returnArray = new int[nums.length];

        for(int i = 0, j = 0; i < n; i++, j++){
            returnArray[j] = nums[i];
            returnArray[++j] = nums[i + n];
        }

        return returnArray;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input1 = { 2, 5, 1, 3, 4, 7 };
        int[] result1 = solution.shuffle(input1, input1.length / 2);
        System.out.println(Arrays.toString(result1));

        int[] input2 = { 1, 2, 3, 4, 4, 3, 2, 1 };
        int[] result2 = solution.shuffle(input2, 4);
        System.out.println(Arrays.toString(result2));
    }
}