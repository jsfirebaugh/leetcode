import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueInts = new HashSet<>();

        for(int i : nums){

            // if i already exists in unique, no need to continue.
            if(uniqueInts.contains(i)){
                return true;
            }

            uniqueInts.add(i);
        }

        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input1 = { 1, 2, 3, 1 };
        int[] input2 = { 1, 2, 3, 4 };
        int[] input3 = { 1, 1, 1, 3, 3, 4, 3, 2, 3, 2 };

        boolean result1 = solution.containsDuplicate(input1);
        boolean result2 = solution.containsDuplicate(input2);
        boolean result3 = solution.containsDuplicate(input3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}