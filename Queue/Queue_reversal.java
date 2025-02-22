import java.util.*;

public class Queue_reversal {
    public static void reversal(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        if (q.isEmpty()) {
            return;
        }
        while (!q.isEmpty()) {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reversal(q);
    }
}
