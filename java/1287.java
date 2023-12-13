class Solution {
    public int findSpecialInteger(int[] arr) {

        int maxCount = 1;
        int thisCount = 1;
        int maxItem = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                thisCount++;

                if(thisCount > maxCount){
                    maxCount = thisCount;
                    maxItem = arr[i];
                }
            } else {
                thisCount = 1;
            }

            if(maxCount > arr.length / 4){
                return arr[i];
            }
        }

        return maxItem;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] inputs = {
                { 1, 2, 2, 6, 6, 6, 6, 7, 10 },
                { 1, 1 },
                { 1, 2, 3, 3 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 12, 12 },
                { 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 12, 12 }
        };

        for(int[] input : inputs){
            System.out.println(solution.findSpecialInteger(input));
        }

    }
}