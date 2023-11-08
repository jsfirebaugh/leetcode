class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;

        for(int i = 1; i <= n; i++){
            if(i % m == 0){
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return num1 - num2;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result = solution.differenceOfSums(10, 3);
        System.out.println(result);
    }
}