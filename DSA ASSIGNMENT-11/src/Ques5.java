import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ques5 {
	public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        
        // Add elements of nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }
        
        // Check for the intersection with nums2
        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
            }
        }
        
        // Convert the set to an array
        int[] result = new int[intersect.size()];
        int index = 0;
        for (int num : intersect) {
            result[index++] = num;
        }
        
        return result;
    }
	public static void main(String[] args) {
		 int[] nums1 = {1, 2, 2, 1};
	        int[] nums2 = {2, 2};
	        int[] result1 = intersection(nums1, nums2);
	        System.out.println(Arrays.toString(result1)); // Output: [2]

	        int[] nums3 = {4, 9, 5};
	        int[] nums4 = {9, 4, 9, 8, 4};
	        int[] result2 = intersection(nums3, nums4);
	        System.out.println(Arrays.toString(result2)); // Output: [9, 4]
	}

}
