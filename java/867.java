import java.util.Arrays;

class Solution {
    public int[][] transpose(int[][] matrix) {
        int newSizeLevel1 = matrix[0].length;
        int newSizeLevel2 = matrix.length;

        int[][] returnArray = new int[newSizeLevel1][newSizeLevel2];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                returnArray[j][i] = matrix[i][j];
            }
        }


        return returnArray;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] input1 = {
                { 1, 2, 3, 99 },
                { 4, 5, 6, 98 },
                { 7, 8, 9, 97 },
                { 10, 11, 12, 96 }
        };

        int[][] result1 = solution.transpose(input1);
        System.out.println(Arrays.deepToString(result1));
    }
} 