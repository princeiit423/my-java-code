package Greedy_Algorithm;

import java.util.ArrayList;

public class Acitivty_selection {
    public static void main(String[] args) {
        // ye question me ending time sorted hai islye thoda easy hai end time sort nhi
        // krna pad rha hai,
        // lekin vhut question me end time sorted nhi rhega to wo problem solve krne ana
        // chaye, ye problem dusra programe me kiye hai check it.

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        // for loop to check select activity is greater than last activity chosesen end
        // time
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activities: " + maxAct);
        System.out.println("-------------------------------------");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}
