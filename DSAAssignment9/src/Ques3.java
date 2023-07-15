
public class Ques3 {
	public static int factorial(int n) {
        // Base case: If n is 0 or 1, the factorial is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Recursive case: Return the product of n and the factorial of (n-1)
        return n * factorial(n - 1);
    }
	public static void main(String[] args) {
		 System.out.println(factorial(5)); // Output: 120
	     System.out.println(factorial(4)); // Output: 24
	}

}
