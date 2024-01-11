class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int matching = 0;

        for(String pattern : patterns){
            if(word.contains(pattern)){
                matching++;
            }
        }

        return matching;
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



