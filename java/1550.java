class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        for(int i = 2; i < arr.length; i++){
            if(arr[i] % 2 == 1 && arr[i-1] % 2 == 1 && arr[i-2] % 2 == 1){
                return true;
            }
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input1 = { 2, 6, 4, 1 };
        boolean result1 = solution.threeConsecutiveOdds(input1);
        System.out.println(result1);

        int[] input2 = { 1, 2, 34, 3, 4, 5, 7, 23, 12 };
        boolean result2 = solution.threeConsecutiveOdds(input2);
        System.out.println(result2);
    }
}