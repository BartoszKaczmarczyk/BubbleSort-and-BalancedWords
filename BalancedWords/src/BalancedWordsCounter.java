import java.util.*;

public class BalancedWordsCounter {

    public static int BalancedWordsCount(String input) {

        if (input == null) {
            throw new RuntimeException("input is null!");
        }

        if (input.equals("")) {
            return 0;
        }

        if (!input.matches("[a-zA-Z]+")) {
            throw new RuntimeException("input contains forbidden characters!");
        }

        List<String> substrings = FindAllSubstring(input);
        int count = 0;
        for (String word : substrings) {
            if (IsBalancedWord(word)) {
                count++;
            }
        }
        return count;
    }

    public static boolean IsBalancedWord(String word){

        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (charMap.containsKey(word.charAt(i))) {
                charMap.replace(word.charAt(i), (charMap.get(word.charAt(i)) + 1));
            } else {
                charMap.put(word.charAt(i), 1);
            }
        }

        Set<Integer> charCountSet = new HashSet<>();
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
                charCountSet.add(entry.getValue());
        }
        if (charCountSet.size() == 1) {
            return true;
        }
        return false;
    }

    public static List<String> FindAllSubstring(String input) {

        List<String> substrings = new ArrayList<>();
        input = input.toLowerCase();
        for(int i=1; i <= input.length(); i++) {
            for(int j=0; j <= (input.length() - i); j++) {
                substrings.add(input.substring(j, j+i));
            }
        }
        return substrings;
    }
}
