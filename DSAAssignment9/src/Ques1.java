
public class Ques1 {
	public static boolean isPowerOfTwo(int n) {
        // Base case: If n becomes 1, it's a power of two
        if (n == 1) {
            return true;
        }
        
        // If n is not divisible by 2 or it becomes 0, it's not a power of two
        if (n % 2 != 0 || n == 0) {
            return false;
        }
        
        // Recursively check if n/2 is a power of two
        return isPowerOfTwo(n / 2);
    }
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(1)); // Output: true
        System.out.println(isPowerOfTwo(16)); // Output: true
        System.out.println(isPowerOfTwo(3)); // Output: false

	}

}
