class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();

        while(columnNumber != 0){
            char newChar = (char)((columnNumber-1) % 26 + 65);
            stringBuilder.insert(0, newChar);
            columnNumber = (columnNumber - 1) / 26;
        }

        return stringBuilder.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int input1 = 1;
        String result1 = solution.convertToTitle(input1);
        System.out.println(result1);

        int input2 = 28;
        String result2 = solution.convertToTitle(input2);
        System.out.println(result2);

        int input3 = 701;
        String result3 = solution.convertToTitle(input3);
        System.out.println(result3);
    }
}