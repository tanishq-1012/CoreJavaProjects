
public class Ques6 {
	public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum element is in the right part of the array
                left = mid + 1;
            } else {
                // Minimum element is in the left part of the array (including the middle element)
                right = mid;
            }
        }

        return nums[left];
    }
	public static void main(String[] args) {
		int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Minimum Element: " + findMin(nums1)); // Output: 1

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum Element: " + findMin(nums2)); // Output: 0

        int[] nums3 = {1, 2, 3};
        System.out.println("Minimum Element: " + findMin(nums3)); // Output: 1
	}

}
