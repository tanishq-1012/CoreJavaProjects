
public class Ques2 {
	public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        // Find the maximum sum of a subarray that doesn't wrap around
        int maxSumNoWrap = kadaneAlgorithm(nums);

        // Find the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Invert the signs of the elements in the array
        for (int i = 0; i < n; i++) {
            nums[i] = -nums[i];
        }

        // Find the maximum sum of a subarray that wraps around
        int maxSumWrap = totalSum + kadaneAlgorithm(nums);

        // Return the overall maximum sum
        return (maxSumWrap > maxSumNoWrap) ? maxSumWrap : maxSumNoWrap;
    }

    // Standard Kadane's algorithm to find the maximum sum of a subarray
    private int kadaneAlgorithm(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
	public static void main(String[] args) {
		Ques2 solution = new Ques2();

        // Example 1
        int[] nums1 = {1, -2, 3, -2};
        System.out.println(solution.maxSubarraySumCircular(nums1)); // Output: 3

        // Example 2
        int[] nums2 = {5, -3, 5};
        System.out.println(solution.maxSubarraySumCircular(nums2)); // Output: 10
	}

}
