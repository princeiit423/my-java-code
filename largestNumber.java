import java.util.Scanner;

public class largestNumber {
    /**
     * @param args
     */
    public static void main(String args[]) {
        System.out.println("Enter the 1st Number");
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num1 > num2) {
                System.out.print(num1);
                System.out.println(" is greater");
            } else if (num2 > num1) {
                System.out.print(num2);
                System.out.println(" is greater");
            } else {
                System.out.println("Both number are equal");
            }
        }
    }

}
