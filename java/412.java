import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fb = new ArrayList<String>();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                fb.add("FizzBuzz");
            } else if(i % 3 == 0) {
                fb.add("Fizz");
            } else if(i % 5 == 0) {
                fb.add("Buzz");
            } else {
                fb.add(Integer.toString(i));
            }
        }

        return fb;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] inputs = { 3, 5, 15 };
        for(int i : inputs){
            List<String> result = solution.fizzBuzz(i);
            System.out.println(result);
        }

    }
}