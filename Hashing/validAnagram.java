import java.util.*;

public class validAnagram {
    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            if (!map.containsKey(t.charAt(j))) {
                System.out.println("Not an anagram");
            }
            map.put(ch, map.get(ch) - 1);
        }
        System.out.println("it is anagram");
    }
}
