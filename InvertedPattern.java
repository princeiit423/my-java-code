public class InvertedPattern {
    public static void main(String args[]) {
        int line, star;
        for (line = 1; line <= 4; line++) {
            for (star = 1; star <= (4 - line + 1); star++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
