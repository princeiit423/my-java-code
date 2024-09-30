import java.util.Arrays;
import java.util.Collections;

public class InbuiltSortingReverseArray {
    public static void main(String args[]) {
        Integer reverse[] = { 5, 8, 2, 9, 7, 4 };
        Arrays.sort(reverse, Collections.reverseOrder());
        Arrays.sort(reverse, 0, 4, Collections.reverseOrder());// reverse array for a particular index
    }
}
