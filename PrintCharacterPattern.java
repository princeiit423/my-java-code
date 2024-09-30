public class PrintCharacterPattern {
    public static void main(String args[]) {
        int n = 4;
        char ch = 'A';
        int chars;
        for (int line = 1; line <= n; line++) {
            for (chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
