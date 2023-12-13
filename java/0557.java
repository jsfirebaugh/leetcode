class Solution {
    public String reverseWords(String s) {
        StringBuilder wordReverse = new StringBuilder();
        StringBuilder returnWord = new StringBuilder();

        for(String word : s.split(" ")){
            wordReverse.delete(0, wordReverse.length());
            returnWord.append(" ").append(wordReverse.append(word).reverse().toString());
        }

        return returnWord.toString().trim();
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "Let's take LeetCode contest";
        String result1 = solution.reverseWords(input1);
        System.out.println(result1);

        String input2 = "God Ding";
        String result2 = solution.reverseWords(input2);
        System.out.println(result2);
    }
}