import java.util.Arrays;

public class Ques2 {
	 public static void sortColors(int[] nums) {
	        int n = nums.length;
	        int low = 0;
	        int high = n - 1;
	        int i = 0;

	        while (i <= high) {
	            if (nums[i] == 0) {
	                swap(nums, i, low);
	                low++;
	                i++;
	            } else if (nums[i] == 2) {
	                swap(nums, i, high);
	                high--;
	            } else {
	                i++;
	            }
	        }
	    }

	    private static void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	public static void main(String[] args) {
		int[] nums1 = {2, 0, 2, 1, 1, 0};
        sortColors(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {2, 0, 1};
        sortColors(nums2);
        System.out.println(Arrays.toString(nums2));

	}

}
