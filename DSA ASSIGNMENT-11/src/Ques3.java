
public class Ques3 {
	 public static int findMissingNumber(int[] nums) {
	        int n = nums.length;
	        int missingNumber = n; // Initialize with n because n is the maximum possible missing number
	        
	        // XOR all the numbers from 0 to n
	        for (int i = 0; i < n; i++) {
	            missingNumber ^= i;
	            missingNumber ^= nums[i];
	        }
	        
	        return missingNumber;
	    }
	public static void main(String[] args) {
		int[] nums1 = {3, 0, 1};
        System.out.println("Missing Number: " + findMissingNumber(nums1)); // Output: 2

        int[] nums2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing Number: " + findMissingNumber(nums2)); // Output: 8
	}

}
