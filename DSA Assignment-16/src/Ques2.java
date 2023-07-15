import java.util.Stack;
public class Ques2 {
	public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }
	public static void main(String[] args) {
		 Stack<Integer> stack = new Stack<>();
	        stack.push(34);
	        stack.push(3);
	        stack.push(31);
	        stack.push(98);
	        stack.push(92);
	        stack.push(23);

	        System.out.println("Original Stack: " + stack);
	        Stack<Integer> sortedStack = sortStack(stack);
	        System.out.println("Sorted Stack: " + sortedStack); // Output: [3, 23, 31, 34, 92, 98]
	}

}
