import java.util.*;

public class Q_union_intersection {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        int count = 0;

        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            set1.add(arr2[j]);
        }
        int ans = set1.size();
        System.out.println(ans);
        // union find code logic over here
        System.out.println("----------------------------------------");
        // code start for Intersection here

        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            set2.add(arr2[j]);
        }

        for (Integer op : set1) {
            if (set2.contains(op)) {
                count++;
            }
        }
        System.out.print(count);

    }
}
