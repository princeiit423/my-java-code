package Greedy_Algorithm;

import java.util.*;

public class Indian_coins {
    public static void main(String[] args) {
        Integer curr[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(curr, Comparator.reverseOrder());
        int count = 0;
        int amount = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < curr.length; i++) {

            if (curr[i] <= amount) {
                while (curr[i] <= amount) {
                    count++;
                    ans.add(curr[i]);
                    amount = amount - curr[i];
                }
            }
        }
        System.out.println("min no. is:" + count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("(" + ans.get(i) + ")");
        }
    }
}
