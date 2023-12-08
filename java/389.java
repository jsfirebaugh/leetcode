class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder stringBuilder = new StringBuilder(t);

        for(char c : s.toCharArray()){
            stringBuilder.deleteCharAt(stringBuilder.indexOf(String.valueOf(c)));
        }

        return stringBuilder.charAt(0);
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "abcd";
        String input2 = "abcde";
        char result1 = solution.findTheDifference(input1, input2);
        System.out.println(result1);

    }
}