//----------------------code By FAIZ HUSSAIN------------------------------------>

public class MergeSort_Algorithm {
    public static void mergesort(int arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid); // left side
        mergesort(arr, mid + 1, ei); // right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // mlet part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right
        while (i <= arr[j++]) {
            temp[k++] = arr[j++];

        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String ars[]) {
        int arr[] = { 4, 36, 87, 2, 8, 6 };
        int ei = arr.length - 1;
        mergesort(arr, 0, ei);

    }
}
