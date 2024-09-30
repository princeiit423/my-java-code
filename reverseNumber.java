import java.util.Scanner;

public class reverseNumber {
    public static void main(String args[]) {
        System.out.println("Enter number to reverse");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while (n > 0) {
                int LastDigit = n % 10;
                System.out.print(LastDigit);
                n = n / 10;
            }

        }
    }
}
