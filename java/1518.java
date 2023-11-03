class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int numberDrank = numBottles;

        while(numBottles >= numExchange){
            numberDrank = numberDrank + (numBottles / numExchange);
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }

        return numberDrank;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int numberOfBottles1 = 9;
        int numberToExchange1 = 3;
        int result1 = solution.numWaterBottles(numberOfBottles1, numberToExchange1);
        System.out.println(result1);

        int numberOfBottles2 = 15;
        int numberToExchange2 = 4;
        int result2 = solution.numWaterBottles(numberOfBottles2, numberToExchange2);
        System.out.println(result2);
    }
}