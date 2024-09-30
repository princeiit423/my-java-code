import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String args[]) {
        System.out.println("Enter your Salary");
        try (Scanner sc = new Scanner(System.in)) {
            int Salary = sc.nextInt();

            if (Salary < 500000) {
                System.out.println("You dont have to pay tax Motherfucker");
            } else if (Salary > 500000 && Salary <= 1000000) {
                float tax1 = Salary * 0.20f;
                System.out.println("You have to pay taxes of amount: " + tax1);
            } else if (Salary > 1000000) {
                float tax2 = Salary * 0.30f;
                System.out.println("Ypu have to pay taxes of amount: " + tax2);
            } else {
                System.out.println("Maa chuda BSDK vhut pqaisa ho gya hai");
            }
        }
    }
}
