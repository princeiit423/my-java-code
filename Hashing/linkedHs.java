import java.util.*;

public class linkedHs {
    public static void main(String[] args) {
        LinkedHashSet<String> city = new LinkedHashSet<>();
        // Linked hash set is used to get data in ordered form.
        city.add("Ranchi");
        city.add("Delhi");
        city.add("Raipur");
        city.add("Mumbai");

        // Iterator method for loop
        Iterator it = city.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("------------------------------------");
        // Advanced iterator method
        for (String cities : city) {
            System.out.println(cities);
        }
    }
}
