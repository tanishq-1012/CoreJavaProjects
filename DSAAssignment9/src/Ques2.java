
public class Ques2 {
	public static int sumOfNaturalNumbers(int n) {
        // Base case: If n is 0 or negative, the sum is 0
        if (n <= 0) {
            return 0;
        }
        
        // Recursive case: Return the sum of n and the sum of (n-1) natural numbers
        return n + sumOfNaturalNumbers(n - 1);
    }
	public static void main(String[] args) {
		System.out.println(sumOfNaturalNumbers(3)); // Output: 6
        System.out.println(sumOfNaturalNumbers(5)); // Output: 15

	}

}
