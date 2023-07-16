
public class Ques2 {
	public int removeElement(int[] nums, int val) {
        int k = 0; // Initialize the pointer to place elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // If the current element is not equal to val, place it at position k
                nums[k] = nums[i];
                k++; // Move the pointer k to the next position to place the next element
            }
        }

        // The first k elements of nums contain the elements not equal to val
        // The remaining elements are not important, and the size of nums is not needed to be changed
        return k;
    }

	public static void main(String[] args) {
		Ques2 solution = new Ques2();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int k = solution.removeElement(nums, val);
        System.out.println("Output: " + k); // Output: 2
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " "); // Output: 2 2
        }
	}

}
