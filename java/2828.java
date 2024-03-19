import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder accr = new StringBuilder();

        for(String s1 : words){
            accr.append(s1.charAt(0));
        }

        return accr.toString().equals(s);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        List<String> list1 = Arrays.asList("alice", "bob", "charlie");
        String search1 = "abc";
        boolean result1 = sol.isAcronym(list1, search1);
        System.out.println(result1);
    }
}