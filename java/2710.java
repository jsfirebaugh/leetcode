class Solution {
    public String removeTrailingZeros(String num) {

        int zeros = 0;

        for(int i = num.length() - 1; i > 0; i--){
            if(num.charAt(i) == '0'){
                zeros++;
            } else {
                break;
            }
        }

        return num.substring(0, num.length() - zeros);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        String input1 = "51230100";
        String result1 = s.removeTrailingZeros(input1);
        System.out.println(result1);

        String input2 = "123";
        String result2 = s.removeTrailingZeros(input2);
        System.out.println(result2);
    }
}
