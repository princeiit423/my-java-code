//---------------- Code by FAIZ HUSSAIN --------------------------------->

//---------------- Tilling Problem --------------------------------->

public class Tiling_problem {
    public static int TileProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // for vertical
        int fnm1 = TileProblem(n - 1);
        // for horizonta
        int fnm2 = TileProblem(n - 2);

        int TotalWays = fnm1 + fnm2;
        return TotalWays;
    }

    public static void main(String args[]) {
        int n = 6;
        System.out.print(TileProblem(n));
    }

}
