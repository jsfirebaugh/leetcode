import java.util.HashMap;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();

        for(char c : s.toCharArray()){
            chars.put(c, chars.getOrDefault(c, 0) + 1);
        }

        int previousCount = 0;

        for(Character key : chars.keySet()){
            if(previousCount == 0){
                previousCount = chars.get(key);
            } else if (previousCount != chars.get(key)){
                return false;
            }
        }

        return true;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "abacbc";
        boolean result1 = solution.areOccurrencesEqual(input1);
        System.out.println(result1);

        String input2 = "aaabb";
        boolean result2 = solution.areOccurrencesEqual(input2);
        System.out.println(result2);

    }
}