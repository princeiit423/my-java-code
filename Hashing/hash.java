//package Hashing;

import java.util.*;

public class hash {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("China", 150);
        map.put("USA", 50);

        System.out.println(map);

        // get function
        int population = map.get("China");
        System.out.println(population);

        // conatinsKey function
        System.out.println(map.containsKey("USA")); // true
        System.out.println(map.containsKey("Bhuan")); // false

        // remove key
        map.remove("China");
        System.out.println(map);
    }
}