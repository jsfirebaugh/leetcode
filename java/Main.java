import java.util.Arrays;

class Solution {
    public int countAsterisks(String s) {

        int astericksCount = 0;
        int index = 0;

        for(String sa : s.split("\\|")){
            if(index++ % 2 == 0){
                for(char c : sa.toCharArray()){
                    astericksCount += c == '*' ? 1 : 0;
                }
            }
        }

        return astericksCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] inputs = {
                "l|*e*et|c**o|*de|",
                "iamprogrammer",
                "yo|uar|e**|b|e***au|tifu|l"
        };

        for(String input : inputs){
            System.out.println(sol.countAsterisks(input));
        }

    }
}