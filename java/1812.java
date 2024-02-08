class Solution {
    public boolean squareIsWhite(String coordinates) {
        return (int) coordinates.charAt(0) % 2 != coordinates.charAt(1) % 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] inputs =  { "a1", "h3" };

        for(String input: inputs){
            System.out.println(s.squareIsWhite(input));
        }
    }
}