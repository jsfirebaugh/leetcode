class Solution {
    public int dayOfYear(String date) {
        String[] dateParts = date.split("-");

        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int days = Integer.parseInt(dateParts[2]);

        int[] noDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for(int i = 0; i < month - 1; i++){
            days += noDays[i];
        }

        days += month > 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 1 : 0;

        return days;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "2019-01-09";
        int result1 = solution.dayOfYear(input1);
        System.out.println(result1);

        String input2 = "2019-02-10";
        int result2 = solution.dayOfYear(input2);
        System.out.println(result2);

    }
}