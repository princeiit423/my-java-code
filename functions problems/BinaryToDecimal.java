public class BinaryToDecimal {
    public static void BintoDec(int bin) {
        int mynum = bin;
        int pow = 0;
        int dec = 0;
        while (bin > 0) {
            int LastDigit = bin % 10;
            dec = dec + (LastDigit * (int) Math.pow(2, pow));
            pow++;
            bin = bin / 10;
        }
        System.out.println("binary number " + mynum + " is converted to decimal number: " + dec);
    }

    public static void main(String args[]) {
        BintoDec(111);
    }
}
