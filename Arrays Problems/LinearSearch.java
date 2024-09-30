import java.util.*;

public class LinearSearch {
    public static int linear_search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 34, 67, 89, 36, 90, 12, 43 };
        // for(int i=0;i<arr.length; i++){
        // int trav= arr[i];
        // }
        // System.out.print("given array is: " + trav);
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = linear_search(arr, key);
        if (index == -1) {
            System.out.println("key not found!");
        } else {
            System.out.println("key is found at index: " + index);
        }
    }
}
