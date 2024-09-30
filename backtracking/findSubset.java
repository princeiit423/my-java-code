public class findSubset {

    public static void subsetFind(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        // yes choice
        subsetFind(str, ans + str.charAt(i), i + 1);
        // no choice
        subsetFind(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = "bcd";
        String ans = "";
        subsetFind(str, ans, 0);
    }
}
