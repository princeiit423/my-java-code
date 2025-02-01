import java.util.*;

public class hshSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2); // 2 ko do baar add kiye lekin add ek he baar hua .
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);

        System.out.println(set);

        // set.remove(2);
        if (set.contains(2)) {
            System.out.println("2 is present in the set");
        }

        set.clear();
        System.out.println(set);
        if (set.isEmpty()) {
            System.out.println("set is empty");
        }
    }
}
