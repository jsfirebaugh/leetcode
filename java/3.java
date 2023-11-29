class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxString = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for(char c : s.toCharArray()){
            if(stringBuilder.indexOf(String.valueOf(c)) != -1){
                stringBuilder.delete(0, 1 + stringBuilder.indexOf(String.valueOf(c)));
            }

            stringBuilder.append(c);
            maxString = Math.max(maxString, stringBuilder.length());
        }

        return maxString;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "abcabcbb";
        int result1 = solution.lengthOfLongestSubstring(input1);
        System.out.println(result1);

        String input2 = "bbbbb";
        int result2 = solution.lengthOfLongestSubstring(input2);
        System.out.println(result2);

        String input3 = "pwwkew";
        int result3 = solution.lengthOfLongestSubstring(input3);
        System.out.println(result3);

        String input4 = " ";
        int result4 = solution.lengthOfLongestSubstring(input4);
        System.out.println(result4);

        String input5 = "dvdf";
        int result5 = solution.lengthOfLongestSubstring(input5);
        System.out.println(result5);

        String input6 = "aabaab!bb";
        int result6 = solution.lengthOfLongestSubstring(input6);
        System.out.println(result6);
    }
}