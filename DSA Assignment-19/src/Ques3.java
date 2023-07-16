import java.util.Arrays;
public class Ques3 {
	public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }

    private void merge(int[] nums, int low, int mid, int high) {
        int[] left = Arrays.copyOfRange(nums, low, mid + 1);
        int[] right = Arrays.copyOfRange(nums, mid + 1, high + 1);

        int i = 0, j = 0, k = low;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        while (i < left.length) {
            nums[k++] = left[i++];
        }

        while (j < right.length) {
            nums[k++] = right[j++];
        }
    }
	public static void main(String[] args) {
		Ques3 solution = new Ques3();

        // Example 1
        int[] nums1 = {5, 2, 3, 1};
        int[] result1 = solution.sortArray(nums1);
        System.out.println(Arrays.toString(result1)); // Output: [1, 2, 3, 5]

        // Example 2
        int[] nums2 = {5, 1, 1, 2, 0, 0};
        int[] result2 = solution.sortArray(nums2);
        System.out.println(Arrays.toString(result2)); // Output: [0, 0, 1, 1, 2, 5]
	}

}
