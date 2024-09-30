//---------------- Code by FAIZ HUSSAIN --------------------------------->

public class FriendPairing {
    public static int FriendsPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // single
        int fnm1 = FriendsPair(n - 1);

        // pair
        int fnm2 = FriendsPair(n - 2);
        int pairways = n - 1 * fnm2;

        int TotalWays = fnm1 + pairways;

        return TotalWays;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(FriendsPair(n));
    }

}
