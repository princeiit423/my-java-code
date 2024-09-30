public class BinomialCoeffiucient {
    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinCoeff(int n, int r) {
        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int nmr_fact = Factorial(n - r);
        int bincoeff = n_fact / (r_fact * nmr_fact);
        return bincoeff;
    }

    public static void main(String args[]) {
        int binomial = BinCoeff(5, 2);
        System.out.println(binomial);

    }
}
