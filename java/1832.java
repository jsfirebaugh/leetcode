import java.util.HashSet;

class Solution {
    public boolean checkIfPangram(String sentence) {

        HashSet<Character> chars = new HashSet<>();

        for(char c : sentence.toCharArray()){
            chars.add(c);

            if(chars.size() == 26){
                break;
            }
        }

        return chars.size() == 26;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String input1 = "thequickbrownfoxjumpsoverthelazydog";
        boolean result1 = s.checkIfPangram(input1);
        System.out.println(result1);

        String input2 = "leetcode";

    }
}
