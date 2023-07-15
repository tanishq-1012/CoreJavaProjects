import java.util.Stack;
public class Ques8 {
	public boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int second = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < second) {
                return true;
            }

            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                second = stack.pop();
            }

            stack.push(nums[i]);
        }

        return false;
    }
	public static void main(String[] args) {
		Ques8 solution = new Ques8();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solution.find132pattern(nums1)); // Output: false

        int[] nums2 = {3, 1, 4, 2};
        System.out.println(solution.find132pattern(nums2)); // Output: true

        int[] nums3 = {-1, 3, 2, 0};
        System.out.println(solution.find132pattern(nums3)); // Output: true
	}

}
