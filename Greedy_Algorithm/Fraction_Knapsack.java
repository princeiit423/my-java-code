package Greedy_Algorithm;

import java.util.*;

public class Fraction_Knapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[val.length][2];
        // oth idx=> index , 1st idx=> ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i; // store idx value
            ratio[i][1] = val[i] / (double) weight[i];
        }
        // ascending order sorting ratio
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalVal = 0;

        // running loop for final logic ,loop should run on descending order
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                // fractional value including logic
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
            }
        }
        System.out.print("max weight:" + finalVal);

    }
}
