public class PrimesInRange {
    public static boolean IsPrime(int n) {
        boolean IsPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                IsPrime = false;
            }

        }
        return IsPrime;
    }

    public static void PrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (IsPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        PrimeInRange(20);
    }
}
