public class substring_function {
    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]) {
        String str = "HelloWorld";
        System.out.print(substring(str, 0, 5));
        // java have inbuilt substring function
        str.substring(0, 6);
    }
}
