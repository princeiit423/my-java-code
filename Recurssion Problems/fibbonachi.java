
public class fibbonachi {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;

        return fn;
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.print(fib(n));
    }
}
