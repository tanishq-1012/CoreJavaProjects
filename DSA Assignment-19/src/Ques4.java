import java.util.Arrays;

public class Ques4 {
	public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < n) {
            nums[j] = 0;
            j++;
        }
    }
	public static void main(String[] args) {
		Ques4 solution = new Ques4();

        // Example
        int[] nums = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums)); // Output: [1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0]
	}

}
