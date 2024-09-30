import java.util.*;

public class selectionSort {
    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    arr[minPos] = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void PrintSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 4, 9, 2, 8 };
        SelectionSort(arr);
        PrintSort(arr);
    }
}
