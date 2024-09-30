import java.util.*;

public class practice01 {
    public static void main(String args[]) {
        System.out.print("Enter three numbers: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            int avg = (num1 + num2 + num3) / 3;
            System.out.println(avg);
        }

    }
}