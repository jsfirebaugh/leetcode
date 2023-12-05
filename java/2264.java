import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public String largestGoodInteger(String num) {
        ArrayList<String> goodNumbers = new ArrayList<String>();

        for(int i = 0; i < num.length() - 2; i++){
            if(num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)){
                goodNumbers.add(num.substring(i, i+3));
            }
        }

        goodNumbers.sort(Comparator.naturalOrder());

        return goodNumbers.isEmpty() ? "" : goodNumbers.get(goodNumbers.size() - 1);
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "677713339";
        String result1 = solution.largestGoodInteger(input1);
        System.out.println(result1);

        String input2 = "2300019";
        String result2 = solution.largestGoodInteger(input2);
        System.out.println(result2);

        String input3 = "42352338";
        String result3 = solution.largestGoodInteger(input3);
        System.out.println(result3);

    }
}