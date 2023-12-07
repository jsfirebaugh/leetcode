import java.util.Arrays;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = String.join("", word1);
        String w2 = String.join("", word2);
        return w1.equals(w2);
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };
        boolean result1 = solution.arrayStringsAreEqual(word1, word2);
        System.out.println(result1);

        String[] word3 = { "a", "cb" };
        String[] word4 = { "a", "bc" };
        boolean result2 = solution.arrayStringsAreEqual(word3, word4);
        System.out.println(result2);

        String[] word5 = { "abc", "d", "defg" };
        String[] word6 = { "abcddefg" };
        boolean result3 = solution.arrayStringsAreEqual(word5, word6);
        System.out.println(result3);
    }
}