import java.util.Scanner;

public class condition {
    public static void main(String args[]) {
        System.out.println("Enter the age");
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("You are an Adult");
            } else if (age < 18 && age >= 12) {
                System.out.println("You are Teenager");
            } else {
                System.out.println("You are a kid");
            }
        }
    }
}
