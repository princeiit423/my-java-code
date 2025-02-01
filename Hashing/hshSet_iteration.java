import java.util.*;

public class hshSet_iteration {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Bangalore");
        city.add("Chennai");
        city.add("Hyderabad");

        // for iteration using iterators method

        Iterator it = city.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // for iteration using advance iterator method

        for (String cities : city) {
            System.out.println(cities);
        }
    }
}
