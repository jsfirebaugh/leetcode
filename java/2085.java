import java.util.HashMap;

class Solution {
    private HashMap<String, Integer> getWordsAsMap(String[] words){
        HashMap<String, Integer> singleWordMap = new HashMap<>();

        for(String word : words){
            singleWordMap.put(word, singleWordMap.getOrDefault(word, 0) + 1);
        }

        return singleWordMap;
    }

    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> wordsMap1 = this.getWordsAsMap(words1);
        HashMap<String, Integer> wordsMap2 = this.getWordsAsMap(words2);

        int commonCount = 0;

        for(String key : wordsMap1.keySet()){
            if(wordsMap2.containsKey(key) && wordsMap1.get(key) == 1 && wordsMap2.get(key) == 1){
                commonCount++;
            }
        }

        return commonCount;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] words1 = { "leetcode","is", "amazing", "as", "is"};
        String[] words2 = { "amazing", "leetcode", "is" };
        int result1 = solution.countWords(words1, words2);
        System.out.println(result1);

        String[] words3 = { "b","bb", "bbb"};
        String[] words4 = { "a", "aa", "aaa" };
        int result2 = solution.countWords(words3, words4);
        System.out.println(result2);

        String[] words5 = { "a", "ab" };
        String[] words6 = { "a", "a", "a", "ab" };
        int result3 = solution.countWords(words5, words6);
        System.out.println(result3);
    }
}