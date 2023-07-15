import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ques4 {
	public static boolean isArrangePossible(Queue<Integer> queue) {
        Queue<Integer> resultQueue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            int front = queue.poll();

            if (front == stack.size() + 1) {
                resultQueue.add(front);
                while (!stack.isEmpty() && stack.peek() == front + 1) {
                    front = stack.pop();
                    resultQueue.add(front);
                }
            } else {
                stack.push(front);
            }
        }

        while (!stack.isEmpty()) {
            int front = stack.pop();
            resultQueue.add(front);
        }

        // Check if the elements in the result queue are in increasing order
        int prev = Integer.MIN_VALUE;
        while (!resultQueue.isEmpty()) {
            int current = resultQueue.poll();
            if (current < prev) {
                return false;
            }
            prev = current;
        }

        return true;
    }
	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(5);
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);

        System.out.println(isArrangePossible(queue1)); // Output: Yes

        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(5);
        queue2.add(1);
        queue2.add(2);
        queue2.add(6);
        queue2.add(3);
        queue2.add(4);

        System.out.println(isArrangePossible(queue2)); // Output: No


	}

}
