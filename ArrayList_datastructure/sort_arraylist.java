package ArrayList_datastructure;

import java.util.*;

public class sort_arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(1);
        list.add(9);

        System.out.print(list);
        System.out.println();
        Collections.sort(list); // ascending order sort by default
        System.out.print(list);
        System.out.println();

        Collections.sort(list, Collections.reverseOrder()); // descending order sort wehere reverse order is comparator
                                                            // function a logic to do what you want in array
        System.out.print(list);
    }
}
