import java.util.Arrays;

class Solution {
    public double[] convertTemperature(double celsius) {
        double k = celsius + 273.15;
        double f = ( celsius * 1.80 ) + 32;

        return new double[]{ k, f };
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        double input1 = 36.5;
        double[] result1 = solution.convertTemperature(input1);
        System.out.println(Arrays.toString(result1));

        double input2 = 122.11;
        double[] result2 = solution.convertTemperature(input2);
        System.out.println(Arrays.toString(result2));
    }
}
