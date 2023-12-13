class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> occurances = new HashMap<>();

        for(int i : nums){
            occurances.put(i, occurances.getOrDefault(i, 0) + 1);

            if(occurances.get(i) > nums.length / 2){
                return i;
            }
        }

        return 0;
    }
}