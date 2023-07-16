import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Ques8 {
	public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersect = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersect.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert List to array
        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            result[i++] = num;
        }

        return result;
    }
	public static void main(String[] args) {
		Ques8 solution = new Ques8();

        // Example
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = solution.intersect(nums1, nums2);
        for (int num : intersection) {
            System.out.print(num + " "); // Output: 2 2
        }
	}

}
