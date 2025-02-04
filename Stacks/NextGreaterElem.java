import java.util.*;

public class NextGreaterElem {
    public static void greaterElem(int arr[], int nextGreator[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreator[i] = -1;
            } else {
                nextGreator[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGreater[] = new int[arr.length];

        greaterElem(arr, nextGreater);

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.println(nextGreater[i]);
        }
    }
}
