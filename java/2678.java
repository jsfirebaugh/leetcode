class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(String s: details){
            count += Integer.parseInt(s.substring(11,13)) > 60 ? 1 : 0;
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] input1 = { "7868190130M7522", "5303914400F9211", "9273338290F4010"};
        int result1 = s.countSeniors(input1);
        System.out.println(result1);

    }
}