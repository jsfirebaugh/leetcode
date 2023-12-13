class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for(String sentence : sentences){
            maxWords = Math.max(maxWords, sentence.split(" ").length);
        }

        return maxWords;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] sentences1 = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        int result1 = solution.mostWordsFound(sentences1);
        System.out.println(result1);

    }
}