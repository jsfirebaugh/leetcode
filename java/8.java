class Solution {
    public int myAtoi(String s) {
        boolean isNegative = false;
        StringBuilder stringBuilder = new StringBuilder();
        s = s.trim();

        if(s.isEmpty()){
            return 0;
        }

        int startingIndex = 0;

        if(s.charAt(0) == '-'){
            isNegative = true;
            stringBuilder.append('-');
            startingIndex++;
        } else if(s.charAt(0) == '+'){
            startingIndex++;
        }

        for(int i = startingIndex; i < s.length(); i++){
            char c = s.charAt(i);

            if(c >= '0' && c <= '9'){
                stringBuilder.append(c);
            } else {
                break;
            }
        }

        if(stringBuilder.isEmpty() || stringBuilder.toString().equals("-")){
            return 0;
        }

        try {
            return Integer.parseInt(stringBuilder.toString());
        } catch(Exception e){
            return !isNegative ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] inputs = { "42", "   -42", "4193 with words", "words and 987", "3.14159", "+-12", "-+12" };

        for(String input : inputs){
            System.out.println(solution.myAtoi(input));
        }
    }
}