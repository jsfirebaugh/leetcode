import java.util.Objects;

class Solution {

    private String parseStringForBackspace(String s) {
        while(s.contains("#")){
            int backspaceIndex = s.indexOf("#");

            if(backspaceIndex == 0) {
                s = s.substring(1);
            } else {
                s = s.replaceFirst(".[#]", "");
            }
        }

        return s;
    }

    public boolean backspaceCompare(String s, String t) {
        String newS = parseStringForBackspace(s);
        String newT = parseStringForBackspace(t);

        return Objects.equals(parseStringForBackspace(s), parseStringForBackspace(t));
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "ab#c";
        String input2 = "ad#c";
        boolean result1 = solution.backspaceCompare(input1, input2);
        System.out.println(result1);

        String input3 = "ab##";
        String input4 = "c#d#";
        boolean result2 = solution.backspaceCompare(input3, input4);
        System.out.println(result2);

        String input5 = "a#c";
        String input6 = "b";
        boolean result3 = solution.backspaceCompare(input5, input6);
        System.out.println(result3);
    }
}