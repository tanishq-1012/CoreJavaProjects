import java.util.Arrays;

public class Ques5 {
	public void rearrange(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;

        while (i < n && j < n) {
            // Find the first positive number
            while (i < n && nums[i] < 0) {
                i++;
            }

            // Find the first negative number after the positive number found by i
            j = i + 1;
            while (j < n && nums[j] >= 0) {
                j++;
            }

            // If both positive and negative numbers are found, swap them
            if (i < n && j < n) {
                swap(nums, i, j);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	public static void main(String[] args) {
		Ques5 solution = new Ques5();

        // Example
        int[] nums = {1, 2, 3, -4, -1, 4};
        solution.rearrange(nums);
        System.out.println(Arrays.toString(nums)); // Output: [-4, 1, -1, 2, 3, 4]
	}

}
