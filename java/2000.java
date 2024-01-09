class Solution {
    public String reversePrefix(String word, char ch) {

        if(word.indexOf(ch) == -1){
            return word;
        }

        StringBuilder sb = new StringBuilder(word.substring(0, word.indexOf(ch) + 1));

        return sb
                .reverse()
                .append(word.substring(word.indexOf(ch) + 1))
                .toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.reversePrefix("abcdefd", 'd'));
        System.out.println(s.reversePrefix("xyxzxe", 'z'));
        System.out.println(s.reversePrefix("abcd", 'z'));
    }
}
