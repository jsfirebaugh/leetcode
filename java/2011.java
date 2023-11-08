class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for(String a : operations){
            x += a.charAt(1) == '+' ? 1 : -1;
        }

        return x;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] input1 = { "--X", "X++", "X++" };
        int result1 = solution.finalValueAfterOperations(input1);
        System.out.println(result1);
    }
}