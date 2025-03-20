public class Climbing_Stairs {
    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int totalWay = countWays(n - 1) + countWays(n - 2);
        return totalWay;
    }

    public static void main(String[] args) {
        System.out.println(countWays(5));
    }
}
