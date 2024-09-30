public class PrimeOrNot {
    public static boolean IsPrime(int n) {
        boolean IsPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                IsPrime = false;
            }

        }
        return IsPrime;

    }

    public static void main(String args[]) {
        System.out.println("given number is: " + IsPrime(9));
    }
}
