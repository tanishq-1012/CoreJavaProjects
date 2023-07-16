import java.util.HashSet;
public class Ques6 {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
	public static void main(String[] args) {
		Ques6 solution = new Ques6();
        int[] nums = {1, 2, 3, 1};
        boolean result = solution.containsDuplicate(nums);
        System.out.println("Output: " + result);
        // Output: true
	}

}
