import java.util.Arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] returnArray = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++){
            returnArray[i] = nums[i];
            returnArray[i + nums.length] = nums[i];
        }

        return returnArray;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input1 = { 1, 2, 1 };
        int[] result1 = solution.getConcatenation(input1);
        System.out.println(Arrays.toString(result1));

        int[] input2 = { 1, 3, 2, 1 };
        int[] result2 = solution.getConcatenation(input2);
        System.out.println(Arrays.toString(result2));
    }
}