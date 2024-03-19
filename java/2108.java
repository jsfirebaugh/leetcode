class Solution {
    public String firstPalindrome(String[] words) {

        StringBuilder sb = new StringBuilder();

        for(String word : words){
            if( word.contentEquals(sb.delete(0, sb.length()).append(word).reverse())){
                return word;
            }

        }

        return "";
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] words1 = { "abc", "car", "ada", "racecar", "cool" };
        String result1 = sol.firstPalindrome(words1);
        System.out.println(result1);
    }
}