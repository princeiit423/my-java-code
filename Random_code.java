import java.util.Scanner;

public class Random_code {
    public static void StarPattern(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            System.out.println("*");
            for (j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void AddSum(int num1, int num2) {
        int sum = (num1 + num2);
        System.out.println("Sum of your number is: " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1)for print star pattern press 1: ");
        System.out.println("2)for print another star pattern press 2: ");
        System.out.println("3)for adding sum of two numbers 3: ");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.print("enter the number for printing stars: ");
            int star = sc.nextInt();
            StarPattern(star);
        } else if (option == 3) {
            System.out.println("Enter the number of yours choice");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number of yours choice");
            int num2 = sc.nextInt();
            AddSum(num1, num2);
        } else {
            System.out.print("invalid option");
        }

    }
}
