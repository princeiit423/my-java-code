import java.util.*;

public class iteration {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("China", 150);
        map.put("Indonesia", 10);
        map.put("Japan", 20);

        Set<String> key = map.keySet();
        for (String k : key) {
            System.out.println("Key: " + k + ", Value: " + map.get(k));
        }
    }
}
