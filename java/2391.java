class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {

        int paperCount = 0;
        int glassCount = 0;
        int metalCount = 0;

        for(int i = garbage.length - 1; i >= 0; i--){
            paperCount += (int) garbage[i].chars().filter(ch -> ch == 'P').count();
            glassCount += (int) garbage[i].chars().filter(ch -> ch == 'G').count();
            metalCount += (int) garbage[i].chars().filter(ch -> ch == 'M').count();

            if(i > 0 && paperCount > 0){
                paperCount += travel[i-1];
            }

            if(i > 0 && glassCount > 0){
                glassCount += travel[i-1];
            }

            if(i > 0 && metalCount > 0){
                metalCount += travel[i-1];
            }
        }

        return paperCount + glassCount + metalCount;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] garbage1 = { "G", "P", "GP", "GG" };
        int[] travel1 = { 2, 4, 3 };
        int result1 = solution.garbageCollection(garbage1, travel1);
        System.out.println(result1);

        String[] garbage2 = { "MMM", "PGM", "GP" };
        int[] travel2 = { 3, 10 };
        int result2 = solution.garbageCollection(garbage2, travel2);
        System.out.println(result2);
    }
}