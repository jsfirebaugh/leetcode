class Solution {
    public String largestOddNumber2(String num) {
        char[] chars = num.toCharArray();
        int endIndex = -1;

        for(int i = chars.length - 1; i >= 0; i--){
            int charAsInt = Character.getNumericValue(chars[i]);
            if(charAsInt % 2 == 1){
                endIndex = i;
                break;
            }
        }

        return endIndex >= 0 ? num.substring(0, endIndex + 1) : "";
    }

    public String largestOddNumber(String num){
        int i = num.length() - 1;

        while(i >= 0){
            if(num.charAt(i) % 2 == 1) return num.substring(0, i + 1);
            i--;
        }

        return "";
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] inputs = { "52", "4206", "35427", "12345678" };

        for(String input: inputs){
            System.out.println("Input is '" + input + "' || Result is '" + solution.largestOddNumber(input) + "'");
        }
    }
}