import java.util.*;

public class PQ_using_JCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3); // O(log n)
        pq.add(1);
        pq.add(7);
        pq.add(4);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

        // output me hamesa smallest number se greatest number he ayega kyuki smallest
        // number k priority jada hai.
    }
}
