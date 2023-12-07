import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        triangle.add(row1);

        for(int i = 1; i < numRows; i++){
            List<Integer> thisRow = new ArrayList<>();

            thisRow.add(1);

            for(int j = 1; j < triangle.get(i - 1).size(); j++){
                int addValue = triangle.get(i - 1).get(j) + triangle.get(i - 1).get(j - 1);
                thisRow.add(addValue);
            }

            thisRow.add(1);
            triangle.add(thisRow);
        }

        return triangle;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] inputs = { 1, 2, 3, 4 };
        for(int rows: inputs){
            System.out.println(solution.generate(rows));
        }

    }
}