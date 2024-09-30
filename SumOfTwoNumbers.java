import java.util.*;

public class SumOfTwoNumbers {
    public static void main(String args[]) {
        System.out.print("Enter First number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            int sum = num1 + num2;

            System.out.println("Sum of two number is: ");
            System.out.println(sum);
        }
    }

}
