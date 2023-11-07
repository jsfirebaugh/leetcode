class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;

        while(n > 1){
            matches = matches + (n / 2);
            n = (n / 2) + (n % 2);
        }

        return matches;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int input1 = 7;
        int result1 = solution.numberOfMatches(input1);
        System.out.println(result1);

        int input2 = 14;
        int result2 = solution.numberOfMatches(input2);
        System.out.println(result2);

    }
}