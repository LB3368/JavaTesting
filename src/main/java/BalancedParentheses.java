import java.util.Stack;

public class BalancedParentheses {
    public static boolean hasBalancedParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "((()))";
        String str2 = "((())";
        String str3 = "())(";

        System.out.println(hasBalancedParentheses(str1));  // Output: true
        System.out.println(hasBalancedParentheses(str2));  // Output: false
        System.out.println(hasBalancedParentheses(str3));  // Output: false
    }
}
