package Stacks;

import java.util.*;

public class Push_bottom {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int head = s.pop();
        pushAtBottom(s, data);
        s.push(head);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        System.out.println(s);
    }
}
