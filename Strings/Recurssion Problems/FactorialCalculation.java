
public class FactorialCalculation {
    public static int FactorialCal(int n) {
        if (n == 0) {
            return 1;
        }
        int fn1 = FactorialCal(n - 1);
        int fn = n * fn1;
        return fn;
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.print(FactorialCal(n));
    }
}
