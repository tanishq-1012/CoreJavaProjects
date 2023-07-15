import java.util.Arrays;

public class Ques7 {
	public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // Find the leftmost occurrence of the target
        int left = binarySearch(nums, target, true);
        if (left == -1) {
            return result;
        }

        // Find the rightmost occurrence of the target
        int right = binarySearch(nums, target, false);

        result[0] = left;
        result[1] = right;
        return result;
    }

    // Binary search function to find the leftmost or rightmost occurrence of the target
    private static int binarySearch(int[] nums, int target, boolean leftMost) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                if (leftMost) {
                    // For leftmost occurrence, continue searching in the left half
                    right = mid - 1;
                } else {
                    // For rightmost occurrence, continue searching in the right half
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
	public static void main(String[] args) {
		int[] nums = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int target2 = 6;
        System.out.println(Arrays.toString(searchRange(nums, target1))); // Output: [3, 4]
        System.out.println(Arrays.toString(searchRange(nums, target2))); // Output: [-1, -1]
	}

}
