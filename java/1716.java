class Solution {
    public int totalMoney(int n) {
        int dollarAmount = 0;
        int runningTotal = 0;

        for(int i = 1; i <= n; i++){
            runningTotal += ++dollarAmount;
            dollarAmount -= i % 7 == 0 ? 6 : 0;
        }

        return runningTotal;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.totalMoney(4));
        System.out.println(solution.totalMoney(10));
        System.out.println(solution.totalMoney(20));
    }
}