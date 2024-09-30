import java.util.Scanner;

public class whileDoMultiple10 {
    /**
     * @param args
     */
    public static void main(String args[]) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
