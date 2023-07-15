import java.util.Stack;

public class Ques3 {
	public static void deleteMiddleElement(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int size = stack.size();
        int midIndex = size / 2;
        deleteElementAt(stack, midIndex);
    }

    private static void deleteElementAt(Stack<Integer> stack, int index) {
        if (index == 0) {
            stack.pop();
            return;
        }

        int temp = stack.pop();
        deleteElementAt(stack, index - 1);
        stack.push(temp);
    }
	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        System.out.println("Original Stack 1: " + stack1);
        deleteMiddleElement(stack1);
        System.out.println("Stack after deleting middle element: " + stack1); // Output: [1, 2, 4, 5]

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        System.out.println("Original Stack 2: " + stack2);
        deleteMiddleElement(stack2);
        System.out.println("Stack after deleting middle element: " + stack2); // Output: [1, 2, 4, 5, 6]

	}

}
