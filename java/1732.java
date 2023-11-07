class Solution {
    public int largestAltitude(int[] gain) {
        int runningGain = 0;
        int maxHeight = 0;

        for(int i : gain){
            runningGain += i;
            maxHeight = Math.max(maxHeight, runningGain);
        }

        return maxHeight;
    }
}