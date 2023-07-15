
public class Ques6 {
	 public static int findNthTerm(int a, int d, int N) {
	        // Base case: If N is 1, return the first term (a)
	        if (N == 1) {
	            return a;
	        }

	        // Recursive case: Return the Nth term using the formula (a + (N - 1) * d)
	        return a + (N - 1) * d;
	    }
	public static void main(String[] args) {
		 int a1 = 2, d1 = 1, N1 = 5;
	        System.out.println("The " + N1 + "th term of the series is: " + findNthTerm(a1, d1, N1)); // Output: 6

	        int a2 = 5, d2 = 2, N2 = 10;
	        System.out.println("The " + N2 + "th term of the series is: " + findNthTerm(a2, d2, N2)); // Output: 23

	}

}
