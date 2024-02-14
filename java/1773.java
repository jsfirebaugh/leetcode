import java.util.List;
import java.util.Map;

class Solution {

    public static Map<String, Integer> keyColumnMap = Map.ofEntries(
            Map.entry("type", 0),
            Map.entry("color", 1),
            Map.entry("name", 2)
    );
    
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        return items
                .stream()
                .filter(entry -> entry.get(keyColumnMap.get(ruleKey)).equals(ruleValue))
                .toList()
                .size();
    }

    public int countMatches2(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;

        for(List<String> entry : items){
            matches += entry.get(keyColumnMap.get(ruleKey)).equals(ruleValue) ? 1 : 0;
        }

        return matches;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<List<String>> inputs = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );

        String ruleKey1 = "color";
        String ruleValue1 = "silver";

        int result1 = s.countMatches(inputs, ruleKey1, ruleValue1);
        System.out.println(result1);

        // ------------------------------------------------------------

        String ruleKey2 = "type";
        String ruleValue2 = "phone";

        int result2 = s.countMatches(inputs, ruleKey2, ruleValue2);
        System.out.println(result2);
    }
}