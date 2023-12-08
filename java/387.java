class Solution {
    public int firstUniqChar(String s) {
        for(char c : s.toCharArray()){
            if(s.indexOf(c) == s.lastIndexOf(c)){
                return s.indexOf(c);
            }
        }

        return -1;
    }
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] inputs = { "leetcode", "loveleetcode", "aabb" };
        for(String input : inputs){
            System.out.println(solution.firstUniqChar(input));
        }

    }
}