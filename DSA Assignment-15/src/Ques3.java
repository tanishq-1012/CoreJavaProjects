import java.util.LinkedList;
import java.util.Queue;

public class Ques3 {
	private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int poppedElement = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return poppedElement;
    }
	public static void main(String[] args) {
		Ques3 stack = new Ques3();
        stack.push(2);
        stack.push(3);
        System.out.print(stack.pop() + " "); // Output: 3
        stack.push(4);
        System.out.print(stack.pop()); // Output: 4
	}

}
