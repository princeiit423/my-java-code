
public class first_occurance {
    public static int FirstOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FirstOcc(arr, key, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 6, 3, 8, 9, 6, 3, 1 };
        int key = 3;
        System.out.print(FirstOcc(arr, key, 0));
    }
}
