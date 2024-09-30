import java.util.*;

public class createString {
    // function to print strings
    public static void printletters(String fullName) {
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
    }

    public static void main(String args[]) {
        String str = "abcd"; // diffrent way to declare string
        String str2 = new String("xyz"); // this is also same but implement on memory is diffrent

        // input/output of strings

        String FirstName;
        Scanner sc = new Scanner(System.in);
        FirstName = sc.nextLine(); // sc.next()-> take string upto space sc.nextLine()-> take string upto line
        System.out.println(FirstName);

        // length of string
        System.out.println(FirstName.length());

        // concetnate of string (adding of diffrent strings)
        String LastName = "Hussain";
        String fullName = (FirstName + LastName);
        System.out.println(FirstName + " " + LastName);

        // string charAtmethod -> finding the positon of string character
        System.out.println(LastName.charAt(3));

        // printing Strings
        printletters(fullName);
    }
}