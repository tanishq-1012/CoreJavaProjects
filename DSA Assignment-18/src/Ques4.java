import java.util.Arrays;
public class Ques4 {
	public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        // Find the maximum element in the array
        int max = Arrays.stream(nums).max().getAsInt();

        // Apply Radix Sort
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(nums, exp);
        }

        // Find the maximum gap in the sorted array
        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
        }

        return maxGap;
    }

    private void countingSort(int[] nums, int exp) {
        int n = nums.length;
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        // Count the occurrences of digits at the current exp position
        for (int i = 0; i < n; i++) {
            count[(nums[i] / exp) % 10]++;
        }

        // Calculate the cumulative count array
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array using the cumulative count array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(nums[i] / exp) % 10] - 1] = nums[i];
            count[(nums[i] / exp) % 10]--;
        }

        // Copy the sorted output array back to the original array
        System.arraycopy(output, 0, nums, 0, n);
    }
	public static void main(String[] args) {
		 Ques4 solution = new Ques4();

	        int[] nums1 = {3, 6, 9, 1};
	        System.out.println("Maximum gap: " + solution.maximumGap(nums1));

	        int[] nums2 = {10};
	        System.out.println("Maximum gap: " + solution.maximumGap(nums2));
	}

}
