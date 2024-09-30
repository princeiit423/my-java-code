public class HalfPyramidPattern {
    public static void main(String args[]) {
        int number = 4;
        int line;
        for (line = 1; line <= 4; line++) {
            for (number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
