import java.util.Scanner;

public class printNum1ton {
    public static void main(String args[]) {
        System.out.println("Enter number to print");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;
            while (count <= n) {
                System.out.println(count);
                count++;
            }
        }
    }
}
