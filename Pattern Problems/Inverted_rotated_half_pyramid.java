public class Inverted_rotated_half_pyramid {
    /**
     * @param n
     */
    public static void Inverted_rotated_halfPyramid(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            // spaces
            for (j = 1; j <= n - i; j++) {
                System.out.println(" ");
            }
            // stars
            for (j = i; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Inverted_rotated_halfPyramid(5);
    }
}
