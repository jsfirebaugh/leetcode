import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int searchInsert(int[] nums, int target) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }

            numbers.add(nums[i]);
        }

        numbers.add(target);
        Collections.sort(numbers);

        return numbers.indexOf(target);
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        //int[] nums1 = { 1, 3, 5, 6 };
        //int target1 = 5;
        //int result1 = solution.searchInsert(nums1, target1);
        //System.out.println(result1);

        int[] nums2 = { 1, 3, 5, 6 };
        int target2 = 2;
        int result2 = solution.searchInsert(nums2, target2);
        System.out.println(result2);
    }
}