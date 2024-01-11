import java.util.Arrays;

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        return (int)Arrays.stream(patterns).filter(word::contains).count();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] patterns1 = { "a", "abc", "bc", "d" };
        String word1 = "abc";
        System.out.println(s.numOfStrings(patterns1, word1));

    }
}