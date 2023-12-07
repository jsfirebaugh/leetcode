class Solution {
    public String removeStars(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for(char c: s.toCharArray()){
            if(c != '*'){
                stringBuilder.append(c);
            } else if(!stringBuilder.isEmpty()){
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }

        return stringBuilder.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "leet**cod*e";
        String result1 = solution.removeStars(input1);
        System.out.println(result1);

        String input2 = "erase*****";
        String result2 = solution.removeStars(input2);
        System.out.println(result2);

        String input3 = "***abc";
        String result3 = solution.removeStars(input3);
        System.out.println(result3);
    }
}