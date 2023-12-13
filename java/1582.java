import java.util.Arrays;

class Solution {
    public int numSpecial(int[][] mat) {
        int specialCounter = 0;

        for(int[] row : mat){
            int rowCount = Arrays.stream(row).sum();
            if(rowCount == 1){
                int rowOneIndex = -1;

                for(int i = 0; i < row.length; i++){
                    if(row[i] == 1){
                        rowOneIndex = i;
                    }
                }

                int columnSum = 0;
                for(int j = 0; j < mat.length; j++){
                    columnSum += mat[j][rowOneIndex];
                }

                if(columnSum == 1){
                    specialCounter++;
                }
            }
        }

        return specialCounter;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] inputs1 = {
                { 1, 0, 0 },
                { 0, 0, 1 },
                { 1, 0, 0 }
        };

        int results1 = solution.numSpecial(inputs1);
        System.out.println(results1);

        int[][] inputs2 = {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1}
        };

        int results2 = solution.numSpecial(inputs2);
        System.out.println(results2);

    }
}