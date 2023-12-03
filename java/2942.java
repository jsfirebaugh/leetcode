import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> matches = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            if(words[i].indexOf(x) != -1){
                matches.add(i);
            }
        }

        return matches;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] input1 = { "leet", "code" };
        char matchChar1 = 'e';
        List<Integer> result1 = solution.findWordsContaining(input1, matchChar1);
        System.out.println(result1);

        String[] input2 = { "abc", "bcd", "aaaa", "cbc" };
        char matchChar2 = 'a';
        List<Integer> result2 = solution.findWordsContaining(input2, matchChar2);
        System.out.println(result2);

    }
}