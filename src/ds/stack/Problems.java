package ds.stack;

import java.util.Stack;

public class Problems {

    public static void main(String[] args) {

        // VALID PARENTHESES
        if (validParentheses("[{[]()}]")) {
            System.out.println("Valid");
        } else {
            System.out.println("In valid");
        }
    }

    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((c == '}' && open != '{') ||
                        (c == ']' && open != '[') ||
                        (c == ')' && open != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}