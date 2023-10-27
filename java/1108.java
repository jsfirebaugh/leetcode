class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "1.1.1.1";
        String input2 = "255.100.50.0";

        System.out.println( solution.defangIPaddr(input1) );
        System.out.println( solution.defangIPaddr(input2) );
    }
}
