class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder stringBuilder = new StringBuilder(magazine);

        for(char c : ransomNote.toCharArray()){
            int charIndex = stringBuilder.indexOf(String.valueOf(c));

            if(charIndex == -1){
                return false;
            }

            stringBuilder.deleteCharAt(charIndex);
        }

        return true;
    }
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String ransomNote1 = "a";
        String magazine1 = "b";
        boolean result1 = solution.canConstruct(ransomNote1, magazine1);
        System.out.println(result1);

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        boolean result2 = solution.canConstruct(ransomNote2, magazine2);
        System.out.println(result2);

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        boolean result3 = solution.canConstruct(ransomNote3, magazine3);
        System.out.println(result3);
    }
}