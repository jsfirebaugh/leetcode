
import java.util.HashSet;

class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> chars = new HashSet<>();

        char returnChar = ' ';

        for(char c : s.toCharArray()){
            if(chars.contains(c)){
                returnChar = c;
                break;
            }

            chars.add(c);
        }

        return returnChar;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "abccbaacz";
        char result1 = solution.repeatedCharacter(input1);
        System.out.println(result1);

    }
}