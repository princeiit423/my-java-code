import java.util.Scanner;

public class primeNumber {
    public static void main(String args[]) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("number is prime");
        } else {
            int i;
            for (i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println("number is not prime");

                }
                break;
            }

        }

        // System.out.println("Number is prime");

    }
}
