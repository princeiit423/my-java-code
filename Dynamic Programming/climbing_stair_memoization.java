import java.util.*;

// memoization me humlog ko bass jo extra calculate hora usko array me dalke time bachana hai bss
public class climbing_stair_memoization {
    public static int countWays(int n, int way[]) {

        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (way[n] != -1) {
            return way[n];
        }
        return way[n] = countWays(n - 1, way) + countWays(n - 2, way);
    }

    public static void main(String[] args) {
        int n = 5;
        int way[] = new int[n + 1];
        Arrays.fill(way, -1);
        System.out.println(countWays(n, way));
    }
}
