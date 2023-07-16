import java.util.Stack;
public class Ques2 {
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '*') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.peek() == '*') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != '*') {
                return false;
            }
        }

        return true;
    }

	public static void main(String[] args) {
		String s = "()";
        System.out.println(isValid(s)); // Output: true
	}

}
