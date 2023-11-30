class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        StringBuilder stringBuilder = new StringBuilder(s);

        for(char c : t.toCharArray()){
            int i = stringBuilder.indexOf(String.valueOf(c));

            if(i == -1){
                return false;
            }

            stringBuilder.deleteCharAt(i);
        }

        return true;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "anagram";
        String t1 = "nagaram";
        boolean result1 = solution.isAnagram(s1, t1);
        System.out.println(result1);

        String s2 = "rat";
        String t2 = "car";
        boolean result2 = solution.isAnagram(s2, t2);
        System.out.println(result2);

    }
}