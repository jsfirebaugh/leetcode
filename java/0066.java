import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }

            digits[i] = 0;
        }

        int[] returnArray = new int[digits.length+1];
        returnArray[0] = 1;

        return returnArray;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input1 = { 1, 2, 3 };
        int[] result1 = solution.plusOne(input1);
        System.out.println(Arrays.toString(result1));

    }
}