public class hollowRectanglePattern {
    public static void HollowRectangle(int totrows, int totcols) {
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totcols; j++) {
                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        HollowRectangle(4, 5);
    }
}
