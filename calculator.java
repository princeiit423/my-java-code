import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        System.out.println("Entert first number");
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            System.out.println("Entert second number");
            int num2 = sc.nextInt();
            System.out.println("Entert operator");
            char operator = sc.next().charAt(0);
            switch (operator) {
                case '+':
                    System.out.println("your Result is: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("your Result is: " + (num1 - num2));

                case '*':
                    System.out.println("your Result is: " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("your Result is: " + (num1 / num2));
                    break;
                case '%':
                    System.out.println("your Result is: " + (num1 % num2));
                    break;
                default:
                    System.out.println("Not valid operator");
            }
        }

    }

}
