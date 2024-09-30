
public class SumNumbers {
    public static int SumNum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = SumNum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    public static void main(String args[]) {
        int n = 9;
        System.out.print(SumNum(n));
    }
}
