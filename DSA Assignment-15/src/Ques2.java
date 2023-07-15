import java.util.*;
public class Ques2 {
	 public static int[] findNearestSmallerNumber(int[] arr) {
	        int n = arr.length;
	        int[] result = new int[n];
	        Arrays.fill(result, -1); // Initialize the result array with -1

	        Stack<Integer> stack = new Stack<>(); // Stack to store indices of elements

	        for (int i = 0; i < n; i++) {
	            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
	                stack.pop(); // Remove the elements which are greater than the current element
	            }

	            if (!stack.isEmpty()) {
	                result[i] = arr[stack.peek()]; // Update the result with the nearest smaller element
	            }

	            stack.push(i); // Push the current element index to the stack
	        }

	        return result;
	    }
	public static void main(String[] args) {
		int[] arr1 = {1, 6, 2};
        int[] result1 = findNearestSmallerNumber(arr1);
        System.out.println(Arrays.toString(result1)); // Output: [-1, 1, 1]

        int[] arr2 = {4, 5, 2, 10, 8};
        int[] result2 = findNearestSmallerNumber(arr2);
        System.out.println(Arrays.toString(result2)); // Output: [-1, 4, -1, 2, 2]
	}

}
