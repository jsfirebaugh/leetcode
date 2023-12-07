class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i = 1; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] prices = {
                { 7, 1, 5, 3, 6, 4 },
                { 7, 6, 4, 3, 1 }
        };

        for(int[] price : prices){
            System.out.println(solution.maxProfit(price));
        }

    }
}