public class inverted_half_pyramid_with_numbers {
    public static void Inverted_half_pyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Inverted_half_pyramid(15);
    }
}
