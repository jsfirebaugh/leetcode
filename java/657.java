class Solution {
    public boolean judgeCircle(String moves) {
        int lr = 0;
        int ud = 0;

        for(char c : moves.toCharArray()){
            if(c == 'U' || c == 'D'){
                ud += c == 'U' ? 1 : -1;
            } else if(c == 'L' || c == 'R'){
                lr += c == 'L' ? 1 : -1;
            }
        }

        return lr == 0 && ud == 0;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "UD";
        boolean result1 = solution.judgeCircle(input1, true);
        System.out.println(result1);

        String input2 = "LL";
        boolean result2 = solution.judgeCircle(input2, true);
        System.out.println(result2);

    }
}