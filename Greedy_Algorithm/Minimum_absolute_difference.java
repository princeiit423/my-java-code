package Greedy_Algorithm;

import java.util.*;

public class Minimum_absolute_difference {
    public static void main(String[] args) {
        int A[] = { 2, 4, 1, 5 };
        int B[] = { 4, 5, 1, 7 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Min Diffrence pair is: " + minDiff);
    }
}
