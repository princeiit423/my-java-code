
public class LastOccurence {
    public static int lastOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;

    }

    public static void main(String args[]) {
        int arr[] = { 3, 4, 1, 5, 6, 4, 9, 2 };
        int key = 4;
        System.out.print(lastOcc(arr, key, 0));
    }
}
