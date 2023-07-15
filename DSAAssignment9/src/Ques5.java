
public class Ques5 {
	 public static int findMaxElement(int[] arr, int index) {
	        // Base case: If the index reaches the end of the array, return Integer.MIN_VALUE
	        if (index == arr.length) {
	            return Integer.MIN_VALUE;
	        }

	        // Recursive case: Return the maximum of the current element and the maximum of the rest of the array
	        return Math.max(arr[index], findMaxElement(arr, index + 1));
	    }

	public static void main(String[] args) {
		 int[] arr1 = {1, 4, 3, -5, -4, 8, 6};
	        System.out.println(findMaxElement(arr1, 0)); // Output: 8

	        int[] arr2 = {1, 4, 45, 6, 10, -8};
	        System.out.println(findMaxElement(arr2, 0)); // Output: 45
	}

}
