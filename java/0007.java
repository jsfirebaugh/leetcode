class Solution {
    public int reverse(int x) {

        try {
            int x2 = x < 0 ? -1 * x : x;

            char[] xCharArray = String.valueOf(x2).toCharArray();
            StringBuilder returnString = new StringBuilder();

            for (int i = xCharArray.length - 1; i >= 0; i--) {
                returnString.append(xCharArray[i]);
            }

            int returnInt = Integer.parseInt(returnString.toString());
            returnInt = x < 0 ? -1 * returnInt : returnInt;

            return returnInt;
        } catch(Exception e){
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int input1 = 120;
        int result1 = solution.reverse(input1);
        System.out.println(result1);
    }
}