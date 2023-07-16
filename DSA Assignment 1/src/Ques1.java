import java.util.HashMap;
public class Ques1 {
	public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement is present in the HashMap
            if (map.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }
            // If not found, add the current element and its index to the HashMap
            map.put(nums[i], i);
        }

        // If no solution found, return an empty array
        return new int[] {};
    }
	public static void main(String[] args) {
		Ques1 solution = new Ques1();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        for (int num : result) {
            System.out.print(num + " "); // Output: 0 1
        }
	}

}
