class Solution {
    public boolean isPalindrome(String s) {

        char[] chars = s
            .toLowerCase()
            .replaceAll("[^0-9a-z]","")
            .toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while(left < right){
            if(chars[left] != chars[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "A man, a plan, a canal: Panama";
        boolean result1 = solution.isPalindrome(input1);
        System.out.println(result1);

        String input2 = "race a car";
        boolean result2 = solution.isPalindrome(input2);
        System.out.println(result2);

        String input3 = " ";
        boolean result3 = solution.isPalindrome(input3);
        System.out.println(result3);
    }
}