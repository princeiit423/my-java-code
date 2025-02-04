//package Stacks;

import java.util.*;

public class reverseString {
    public static void reverseString(String s, Stack<Character> stack) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stack.push(ch);
        }
        for (int i = 0; i < s.length(); i++) {
            char sb = stack.pop();
            res.append(sb);
        }
        System.out.print(res);
    }

    public static void main(String args[]) {
        String s = "Faiz";
        Stack<Character> stack = new Stack<>();
        reverseString(s, stack);
    }
}
