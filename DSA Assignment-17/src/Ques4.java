import java.util.LinkedList;
import java.util.Queue;
class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        // Remove requests that are older than t - 3000
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }
        
        // Add the new request and return the number of requests in the range [t - 3000, t]
        requests.offer(t);
        return requests.size();
    }
}
public class Ques4 {

	public static void main(String[] args) {
		RecentCounter counter = new RecentCounter();
        System.out.println(counter.ping(1)); // Output: 1
        System.out.println(counter.ping(100)); // Output: 2
        System.out.println(counter.ping(3001)); // Output: 3
        System.out.println(counter.ping(3002)); // Output: 3
	}

}
