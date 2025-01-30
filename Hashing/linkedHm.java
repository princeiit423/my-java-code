import java.util.*;

public class linkedHm {
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("USA", 50);

        System.out.print(lhm); // note yaha sara element order me ayega simple hashmap me nhi ata hai.
    }
}