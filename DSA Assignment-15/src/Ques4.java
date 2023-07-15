import java.util.Stack;
public class Ques4 {
	 public static void reverse(Stack<Integer> stack) {
	        if (stack.isEmpty() || stack.size() == 1) {
	            return; // Base case: stack is already reversed
	        } else {
	            int temp = stack.pop(); // Remove the top element
	            reverse(stack); // Recursively reverse the remaining stack
	            insertAtBottom(stack, temp); // Insert the element at the bottom
	        }
	    }
	 private static void insertAtBottom(Stack<Integer> stack, int value) {
	        if (stack.isEmpty()) {
	            stack.push(value); // Base case: stack is empty, so push the value
	        } else {
	            int temp = stack.pop(); // Remove the top element
	            insertAtBottom(stack, value); // Recursively insert the value at the bottom
	            stack.push(temp); // Push back the removed element
	        }
	    }
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(7);
        stack.push(6);

        System.out.println("Original Stack: " + stack);
        reverse(stack);
        System.out.println("Reversed Stack: " + stack); // Output: [6, 7, 1, 2, 3]
	}

}
