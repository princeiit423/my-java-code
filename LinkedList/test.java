package LinkedList;

import java.util.*;

public class test {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value: ");
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.println();
        reverseArray(arr);

    }
}
