import java.util.*;

public class pairsInArray {
    public static void PairsArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 6, 8, 9, 4, 7 };
        PairsArray(numbers);
    }
}
