
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Ques8 {
	public static int[] intersect(int[] nums1, int[] nums2) {
        // Create HashMap to store element frequencies in nums1
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> intersect = new ArrayList<>();
        
        // Find common elements and their frequencies from nums2
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersect.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        
        // Convert the list to an array
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
        int[] result1 = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result1)); // Output: [2, 2]

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = intersect(nums3, nums4);
        System.out.println(Arrays.toString(result2)); // Output: [9, 4]
	}

}
