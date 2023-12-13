class Solution {
    public int lengthOfLastWord(String s) {
        String[] wordArray = s.trim().split(" +");
        return wordArray[wordArray.length - 1].length();
    }

    public int lengthOfLastWord_v2(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(" ") - 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "Hello World";
        int result1 = solution.lengthOfLastWord(input1);
        int result1_2 = solution.lengthOfLastWord_v2(input1);
        System.out.println(result1);
        System.out.println(result1_2);
        System.out.println("------------");

        String input2 = "   fly me   to   the moon  ";
        int result2 = solution.lengthOfLastWord(input2);
        int result2_2 = solution.lengthOfLastWord_v2(input2);
        System.out.println(result2);
        System.out.println(result2_2);
        System.out.println("------------");

        String input3 = "luffy is still joyboy";
        int result3 = solution.lengthOfLastWord(input3);
        int result3_2 = solution.lengthOfLastWord_v2(input3);
        System.out.println(result3);
        System.out.println(result3_2);
        System.out.println("------------");
    }
}