package Greedy_Algorithm;

import java.util.*;

public class Job_sequence {
    public static void main(String[] args) {
        int job[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        Arrays.sort(job, Comparator.comparingDouble(o -> o[1]));

        int time = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < job.length; i++) {
            if (job[i][0] < time) {
                ans.add(job[i][1]);
                time++;
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
