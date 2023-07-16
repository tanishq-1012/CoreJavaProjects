
public class Ques7 {
	public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex] = num;
                nonZeroIndex++;
            }
        }
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

	public static void main(String[] args) {
		 Ques7 solution = new Ques7();
	        int[] nums = {0, 1, 0, 3, 12};
	        solution.moveZeroes(nums);
	        System.out.print("Output: [");
	        for (int i = 0; i < nums.length; i++) {
	            System.out.print(nums[i]);
	            if (i < nums.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	        // Output: [1, 3, 12, 0, 0]
	}

}
