public class FunctionOverloadingUsingDataTypes {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println("sum of integers are: " + sum(6, 9));
        System.out.println("sum of floats are: " + sum(6.8f, 7.9f));
    }
}
