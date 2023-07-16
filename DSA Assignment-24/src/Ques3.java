
public class Ques3 {
	public int findMajorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }

        return candidate;
    }
	public static void main(String[] args) {
		Ques3 solution = new Ques3();

        // Example
        int[] nums = {3, 2, 3};
        int majorityElement = solution.findMajorityElement(nums);
        System.out.println(majorityElement); // Output: 3
	}

}
