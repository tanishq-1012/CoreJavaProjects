
public class Ques3 {
	public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If the target is not found, left will be the index where it would be inserted in order
        return left;
    }
	public static void main(String[] args) {
		Ques3 solution = new Ques3();
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        int result = solution.searchInsert(nums, target);
        System.out.println("Output: " + result); // Output: 2
	}

}
