import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
public class Ques7 {
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        HashSet<Integer> intersect = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersect.add(num);
            }
        }

        // Convert HashSet to array
        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            result[i++] = num;
        }

        return result;
    }
	public static void main(String[] args) {
		Ques7 solution = new Ques7();

        // Example
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = solution.intersection(nums1, nums2);
        for (int num : intersection) {
            System.out.print(num + " "); // Output: 2
        }
	}

}
