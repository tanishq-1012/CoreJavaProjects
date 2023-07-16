
public class Ques4 {
	public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If the current digit is less than 9, simply increment it by 1
                digits[i]++;
                return digits;
            } else {
                // If the current digit is 9, set it to 0 and move to the next digit
                digits[i] = 0;
            }
        }
        
        // If we reach here, it means all digits were 9, so we need to add one more digit
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
	public static void main(String[] args) {
		Ques4 solution = new Ques4();
        int[] digits = {1, 2, 3};
        int[] result = solution.plusOne(digits);
        System.out.print("Output: ");
        for (int digit : result) {
            System.out.print(digit);
        }
        // Output: [1, 2, 4]
	}

}
