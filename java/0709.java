class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "Hello";
        String result1 = solution.toLowerCase(input1);
        System.out.println(result1);
    }
}