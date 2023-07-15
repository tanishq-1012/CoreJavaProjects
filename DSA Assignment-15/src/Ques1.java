import java.util.*;
public class Ques1 {
	public static int[] findNextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize the result array with -1

        Stack<Integer> stack = new Stack<>(); // Stack to store indices of elements

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop(); // Remove the elements which are smaller than the current element
            }

            if (!stack.isEmpty()) {
                result[i] = arr[stack.peek()]; // Update the result with the next greater element
            }

            stack.push(i); // Push the current element index to the stack
        }

        return result;
    }

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 2, 4};
        int[] result1 = findNextGreaterElement(arr1);
        System.out.println(Arrays.toString(result1)); // Output: [3, 4, 4, -1]

        int[] arr2 = {4, 5, 2, 25};
        int[] result2 = findNextGreaterElement(arr2);
        System.out.println(Arrays.toString(result2)); // Output: [5, 25, 25, -1]
	}

}
