import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> returnList =new ArrayList<Boolean>(Arrays.asList(new Boolean[candies.length]));

        int maxValue = Arrays.stream(candies).max().getAsInt();

        for(int i = 0; i < candies.length; i++){
            returnList.set(i, candies[i] + extraCandies >= maxValue);
        }

        return returnList;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] input1 = { 2, 3, 5, 1, 3 };
        int extraCandies1 = 3;

        List<Boolean> result1 = sol.kidsWithCandies(input1, extraCandies1);
        System.out.println(result1);

    }
}