import java.util.*;

public class valid_parenthesis {
    public static void main(String[] args) {
        String s = "({[]}())";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("invalid Parenthesis");
                }
                if (stack.peek() == '(' && ch == ')' || stack.peek() == '{' && ch == '}'
                        || stack.peek() == '[' && ch == ']') {
                    stack.pop();
                } else {
                    System.out.println("invalid Parenthesis");
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Valid Parenthesis");
        } else {
            System.out.println("Invalid Parenthesis");
        }

    }
}
