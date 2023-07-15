import java.util.HashSet;
public class Ques5 {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

	public static void main(String[] args) {
		Ques5 solution = new Ques5();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums1)); // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums2)); // Output: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(solution.containsDuplicate(nums3)); // Output: true
	}

}
