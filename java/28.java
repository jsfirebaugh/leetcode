class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int result1 = solution.strStr(haystack1, needle1);
        System.out.println(result1);

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int result2 = solution.strStr(haystack2, needle2);
        System.out.println(result2);
    }
}