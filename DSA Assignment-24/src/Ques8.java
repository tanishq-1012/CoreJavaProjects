import java.util.*;
public class Ques8 {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;

        // Find the closest index to x using binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                left = mid;
                break;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Expand the window to contain k closest elements
        left--; // Move left pointer to the left of the closest index
        right++; // Move right pointer to the right of the closest index

        while (k > 0) {
            if (left >= 0 && right < arr.length) {
                int leftDistance = Math.abs(arr[left] - x);
                int rightDistance = Math.abs(arr[right] - x);

                if (leftDistance <= rightDistance) {
                    result.add(arr[left]);
                    left--;
                } else {
                    result.add(arr[right]);
                    right++;
                }
            } else if (left >= 0) {
                result.add(arr[left]);
                left--;
            } else if (right < arr.length) {
                result.add(arr[right]);
                right++;
            }

            k--;
        }

        // Sort the result list in ascending order
        Collections.sort(result);
        return result;
    }
	public static void main(String[] args) {
		 Ques8 solution = new Ques8();

	        // Example
	        int[] arr = {1, 2, 3, 4, 5};
	        int k = 4;
	        int x = 3;
	        List<Integer> closestElements = solution.findClosestElements(arr, k, x);
	        System.out.println(closestElements);
	        // Output: [1, 2, 3, 4]

	}

}
