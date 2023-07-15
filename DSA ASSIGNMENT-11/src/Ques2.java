
public class Ques2 {
	public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < nums[mid + 1]) {
                // Move towards the direction with the higher neighboring element
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 1};
        System.out.println("Peak Element Index: " + findPeakElement(nums1)); // Output: 2

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println("Peak Element Index: " + findPeakElement(nums2)); // Output: 4
	}

}
