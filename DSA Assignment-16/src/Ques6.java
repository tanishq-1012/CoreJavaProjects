import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Ques6 {
	public static void reverseFirstKElements(Queue<Integer> queue, int k) {
        if (queue == null || k <= 0 || k > queue.size()) {
            throw new IllegalArgumentException("Invalid input");
        }

        Stack<Integer> stack = new Stack<>();

        // Remove the first k elements from the queue and push them into the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Pop elements from the stack and enqueue them back into the queue
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        // Move the remaining elements in the queue after the first k elements to the end
        for (int i = 0; i < queue.size() - k; i++) {
            queue.offer(queue.poll());
        }
    }
	public static void main(String[] args) {
		 Queue<Integer> queue = new LinkedList<>();
	        queue.offer(1);
	        queue.offer(2);
	        queue.offer(3);
	        queue.offer(4);
	        queue.offer(5);

	        int k = 3;
	        System.out.println("Original queue: " + queue);
	        reverseFirstKElements(queue, k);
	        System.out.println("Queue after reversing first " + k + " elements: " + queue);
	}

}
