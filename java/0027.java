import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int notMatching = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[notMatching] = nums[i];
                notMatching++;
            }
        }

        return notMatching;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input1 = { 3, 2, 2, 3 };
        int val1 = 3;
        int result1 = solution.removeElement(input1, val1);
        System.out.println(result1);

        int[] input2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val2 = 2;
        int result2 = solution.removeElement(input2, val2);
        System.out.println(result2);
    }
}