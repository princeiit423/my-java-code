public class DecimaltoBinary {
    public static void DectoBin(int n) {
        int pow = 0;
        int binNum = 0;
        int mynum = n;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Decimal number " + mynum + " converted to binary: " + binNum);
    }

    public static void main(String args[]) {
        DectoBin(67);
    }
}
