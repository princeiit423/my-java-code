import java.util.*;

public class insert_heap {
    static class heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1;
            int par = (arr.size() - 2) / 2;

            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }
            if (minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        public int remove() {
            // step-1 get first data
            int data = arr.get(0);
            // step-2 swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.size() - 1);
            arr.set(arr.size() - 1, temp);

            arr.remove(arr.size() - 1);
            // step-3 heapify to fix the heap
            heapify(0);
            return data;
        }
    }

    public static void main(String args[]) {

    }
}
