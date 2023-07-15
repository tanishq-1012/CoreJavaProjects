import java.util.Stack;
public class Ques5 {
	 public static String reverseString(String s) {
	        Stack<Character> stack = new Stack<>();
	        for (char ch : s.toCharArray()) {
	            stack.push(ch);
	        }

	        StringBuilder reversedString = new StringBuilder();
	        while (!stack.isEmpty()) {
	            reversedString.append(stack.pop());
	        }

	        return reversedString.toString();
	    }
	public static void main(String[] args) {
		String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed); // Output: "!dlroW ,olleH"
	}

}
