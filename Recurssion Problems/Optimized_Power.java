//<------------------ Code BY FAIZ HUSSAIN ------------------------>

public class Optimized_Power {
    public static int OptPower(int x, int n) {
        if (n == 0) {
            return -1;
        }
        int HalfPowered = OptPower(x, n / 2) * OptPower(x, n / 2);
        if (n % 2 != 0) {
            int HP = HalfPowered * x;
            return HP;
        }
        return HalfPowered;
    }

    public static void main(String args[]) {
        int x = 6;
        int n = 3;
        System.out.print(OptPower(x, n));
    }

}
