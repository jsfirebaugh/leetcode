class Solution {
    public static int numJewelsInStones(String jewels, String stones) {
        int matches = 0;

        for(int i = 0; i < stones.length(); i++){
            if(jewels.indexOf(stones.charAt(i)) != -1){
                matches += 1;
            }
        }

        return matches;
    }
}

public class Main {
    public static void main(String[] args) {
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        int result1 = Solution.numJewelsInStones(jewels1, stones1);
        System.out.println(result1);

        String jewels2 = "z";
        String stones2 = "ZZ";
        int result2 = Solution.numJewelsInStones(jewels2, stones2);
        System.out.println(result2);
    }
}
