public class ProductOfNumber {

    /**
     * @param a
     * @param b
     * @return
     */
    public static int multiply(int a, int b) {
        int product = (a * b);
        return product;
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 34;
        int prod = multiply(a, b);
        System.out.println("multiply of a*b is: " + prod);

    }
}
