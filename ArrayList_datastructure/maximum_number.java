package ArrayList_datastructure;

import java.util.*;

public class maximum_number {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(8);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > max) {
                max = list.get(i);

            }
        }
        System.out.print("maximum value: " + max);

    }
}
