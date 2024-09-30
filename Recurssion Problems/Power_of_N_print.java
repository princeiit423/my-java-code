
public class Power_of_N_print {
    public static int Pow(int x, int n) {
        if (n == 1) {
            return x;
        }
        int pnm1 = Pow(x, n - 1);
        int pn = x * pnm1;
        return pn;
    }

    public static void main(String args[]) {
        int x = 5;
        int n = 2;
        System.out.print(Pow(x, n));
    }
}
