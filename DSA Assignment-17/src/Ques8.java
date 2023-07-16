import java.util.LinkedList;
import java.util.Queue;
public class Ques8 {
	private Queue<Integer> queue;
    private int value;
    private int k;

    public Ques8(int value, int k) {
        this.queue = new LinkedList<>();
        this.value = value;
        this.k = k;
    }

    public boolean consec(int num) {
        queue.add(num);
        if (queue.size() > k) {
            queue.poll();
        }

        return queue.size() == k && areAllEqual(queue, value);
    }

    private boolean areAllEqual(Queue<Integer> queue, int value) {
        for (int num : queue) {
            if (num != value) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Ques8 dataStream = new Ques8(5, 3);
        System.out.println(dataStream.consec(5)); // Output: false
        System.out.println(dataStream.consec(5)); // Output: false
        System.out.println(dataStream.consec(5)); // Output: true
        System.out.println(dataStream.consec(5)); // Output: true
        System.out.println(dataStream.consec(4)); // Output: false
	}

}
