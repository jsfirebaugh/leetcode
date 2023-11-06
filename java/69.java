class Solution {
    public int mySqrt(int x) {
        long returnNumber = x;

        while(returnNumber * returnNumber > x){
            returnNumber = (returnNumber + x / returnNumber ) / 2;
        }

        return (int) returnNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int input1 = 4;
        int result1 = solution.mySqrt(input1);
        System.out.println(result1);

        int input2 = 8;
        int result2 = solution.mySqrt(input2);
        System.out.println(result2);
    }
}