
public class Ques4 {
	public static int findExponent(int N, int P) {
        // Base case: If P is 0, the exponent is 1
        if (P == 0) {
            return 1;
        }
        
        // Recursive case: Return N multiplied by the exponent of (N, P-1)
        return N * findExponent(N, P - 1);
    }
	public static void main(String[] args) {
		 System.out.println(findExponent(5, 2)); // Output: 25
	     System.out.println(findExponent(2, 5)); // Output: 32
	}

}
