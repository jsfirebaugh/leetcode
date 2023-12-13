class Solution {
    public void reverseString(char[] s) {
        char[] sCopy = s.clone();
        int counter1 = s.length;

        for(int i = 0; i < s.length; i++){
            s[i] = sCopy[--counter1];
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "hello";
        solution.reverseString(input1.toCharArray());
    }
}