// --------------------Cde by Faiz Hussain ------------------------------------->

public class PrintBinaryNumber {
    public static void PrintBinNum(int n, int LastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        PrintBinNum(n - 1, 0, str + "0");
        if (LastPlace == 0) {
            PrintBinNum(n - 1, 0, str + "1");
        }
    }

    public static void main(String args[]) {
        PrintBinNum(3, 0, "");
    }
}
