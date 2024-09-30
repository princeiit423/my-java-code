import java.util.*;

public class UserInput {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String input = sc.next(); //-> sc.next only scan first word.
        // System.out.println(input);

        // Scanner sc = new Scanner(System.in);
        // String input = sc.nextLine(); //-> sc.nextLine function used for scanning all
        // the space and word on line
        // System.out.println(input);

        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt(); // -> sc.nextLine function used for scanning all the space and word on line
            System.out.println(number);
        }
    }
}
