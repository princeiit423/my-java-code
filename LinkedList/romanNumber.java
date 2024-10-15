package LinkedList;

public class romanNumber {
    public static void RomantoNumber(String roman) {
        for (int i = 0; i < roman.length(); i++) {
            char ch = roman.charAt(i);
            System.out.println(ch);

        }
    }

    public static void main(String args[]) {
        String roman = "IIV";
        RomantoNumber(roman);
    }
}
