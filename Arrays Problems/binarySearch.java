import java.util.*;

public class binarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] <= key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 23, 56, 87, 90, 26, 75 };
        int key = 87;
        System.out.println("Given number is found at index: " + binarySearch(numbers, key));
    }
}
