class Solution {
    public boolean isPalindrome(int x) {
        char[] xCharArray = String.valueOf(x).toCharArray();
        int xCharArrayPosition = 0;

        while(xCharArrayPosition < xCharArray.length / 2){
            if(xCharArray[xCharArrayPosition] != xCharArray[xCharArray.length-1-xCharArrayPosition]){
                return false;
            }

            xCharArrayPosition++;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int input1 = 121;
        boolean result1 = solution.isPalindrome(input1);
        System.out.println(result1);

        int input2 = -121;
        boolean result2 = solution.isPalindrome(input2);
        System.out.println(result2);

        int input3 = 10;
        boolean result3 = solution.isPalindrome(input3);
        System.out.println(result3);
    }
}