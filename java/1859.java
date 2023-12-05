import java.util.Arrays;

class Solution {
    public String sortSentence(String s) {
        String[] sentenceArray = s.split(" ");
        String[] resultArray = new String[sentenceArray.length];

        for(String word: sentenceArray){
            int thisIndex = Character.getNumericValue(word.charAt(word.length() - 1));
            resultArray[thisIndex - 1] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", resultArray);
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "is2 sentence4 This1 a3";
        String r1 = solution.sortSentence(s1);
        System.out.println(r1);
    }
}