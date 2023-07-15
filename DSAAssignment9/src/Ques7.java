
public class Ques7 {
	 public static void printPermutations(String s, int left, int right) {
	        // Base case: If the left and right indices are the same, print the current permutation
	        if (left == right) {
	            System.out.println(s);
	        } else {
	            // Recursive case: Swap each character with all characters to its right and recursively generate permutations
	            for (int i = left; i <= right; i++) {
	                s = swap(s, left, i);
	                printPermutations(s, left + 1, right);
	                s = swap(s, left, i); // Backtrack to restore the original string
	            }
	        }
	    }
	 public static String swap(String s, int i, int j) {
	        char[] charArray = s.toCharArray();
	        char temp = charArray[i];
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return new String(charArray);
	    }
	public static void main(String[] args) {
		String S1 = "ABC";
        System.out.println("Permutations of " + S1 + ":");
        printPermutations(S1, 0, S1.length() - 1);

        String S2 = "XY";
        System.out.println("\nPermutations of " + S2 + ":");
        printPermutations(S2, 0, S2.length() - 1);
	}

}
