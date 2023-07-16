import java.util.Arrays;

public class Ques6 {
	public int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for merged array

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1 and arr2, if any
        while (i < n1) {
            merged[k++] = arr1[i++];
        }
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
	public static void main(String[] args) {
		Ques6 solution = new Ques6();

        // Example
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        int[] merged = solution.merge(arr1, arr2);
        System.out.println(Arrays.toString(merged)); // Output: [1, 2, 3, 4, 4, 5, 6, 8]
	}

}
