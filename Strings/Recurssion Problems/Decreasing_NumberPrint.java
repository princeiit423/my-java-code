public class Decreasing_NumberPrint {
    public static void PrintDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        PrintDec(n - 1);
    }

    public static void main(String args[]) {
        int n = 100;
        PrintDec(n);
    }

}
