
public class Ques8 {
	public static int productOfArray(int[] arr, int index) {
        // Base case: If the index reaches the end of the array, return 1 (identity element for multiplication)
        if (index == arr.length) {
            return 1;
        }

        // Recursive case: Return the product of the current element and the product of the rest of the array
        return arr[index] * productOfArray(arr, index + 1);
    }
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Product of the elements: " + productOfArray(arr1, 0)); // Output: 120

        int[] arr2 = {1, 6, 3};
        System.out.println("Product of the elements: " + productOfArray(arr2, 0)); // Output: 18
	}

}
