import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(strs);

        search : {
            for (int i = 0; i < strs[0].length(); i++) {
                for (String s : strs) {
                    if (s.charAt(i) != strs[0].charAt(i)) {
                        break search;
                    }
                }

                stringBuilder.append(strs[0].charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[][] inputs = {
            { "flower", "flow", "flight" },
            { "dog", "racecar", "car" }
        };

        for(String[] input : inputs){
            String result = solution.longestCommonPrefix(input);
            System.out.println("Prefix:" + result);
        }
    }
}