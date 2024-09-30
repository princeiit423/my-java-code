import java.util.Scanner;

public class FunctionSum {
    public static void calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.print("sum is: " + sum);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.println("Enter first number");
            int b = sc.nextInt();
            System.out.println("Enter second number");
            calculateSum(a, b);
        }

    }
}
