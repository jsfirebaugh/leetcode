class Solution {
    public String finalString(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for(char i : s.toCharArray()){
            if(i == 'i'){
                stringBuilder.reverse();
            } else {
                stringBuilder.append(i);
            }
        }

        return stringBuilder.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "string";
        String result1 = solution.finalString(input1);
        System.out.println(result1);
    }
}