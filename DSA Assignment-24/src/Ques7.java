import java.util.*;
public class Ques7 {
	 public int[] maxSlidingWindow(int[] nums, int k) {
	        if (nums == null || nums.length == 0) {
	            return new int[0];
	        }

	        int n = nums.length;
	        int[] result = new int[n - k + 1];
	        Deque<Integer> deque = new LinkedList<>();

	        for (int i = 0; i < n; i++) {
	            // Remove indices that are outside the window from the front of the deque
	            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
	                deque.poll();
	            }

	            // Remove smaller elements from the back of the deque
	            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
	                deque.pollLast();
	            }

	            deque.offer(i);

	            // Add the maximum element in the current window to the result array
	            if (i >= k - 1) {
	                result[i - k + 1] = nums[deque.peek()];
	            }
	        }

	        return result;
	    }
	public static void main(String[] args) {
		Ques7 solution = new Ques7();

        // Example
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] maxSlidingWindow = solution.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(maxSlidingWindow));
        // Output: [3, 3, 5, 5, 6, 7]
	}

}
