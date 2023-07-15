
public class Ques4 {
	public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        // Phase 1: Find the intersection point (tortoise and hare)
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        // Phase 2: Find the start of the cycle (duplicate number)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
	public static void main(String[] args) {
		int[] nums1 = {1, 3, 4, 2, 2};
        System.out.println("Repeated Number: " + findDuplicate(nums1)); // Output: 2

        int[] nums2 = {3, 1, 3, 4, 2};
        System.out.println("Repeated Number: " + findDuplicate(nums2)); // Output: 3

	}

}
