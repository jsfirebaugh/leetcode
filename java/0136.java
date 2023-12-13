import java.util.HashSet;

class Solution {
    public int singleNumber(int[] nums) {

        HashSet<Integer> numbers = new HashSet<>();

        for(int i : nums){
            if(numbers.contains(i)){
                numbers.remove(i);
            } else {
                numbers.add(i);
            }
        }

        return numbers.iterator().next();
    }

}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input1 = { 2, 2, 1 };
        int result1 = solution.singleNumber(input1);
        System.out.println(result1);

        int[] input2 = { 4, 1, 2, 1, 2 };
        int result2 = solution.singleNumber(input2);
        System.out.println(result2);

        int[] input3 = { 1 };
        int result3 = solution.singleNumber(input3);
        System.out.println(result3);
    }
}