import java.util.Stack;
public class Ques5 {
	 public static int reverseNumber(int num) {
	        Stack<Integer> stack = new Stack<>();

	        // Push each digit of the number into the stack
	        while (num > 0) {
	            int digit = num % 10;
	            stack.push(digit);
	            num /= 10;
	        }

	        // Pop digits from the stack and build the reversed number
	        int reversedNum = 0;
	        int placeValue = 1;
	        while (!stack.isEmpty()) {
	            int digit = stack.pop();
	            reversedNum += digit * placeValue;
	            placeValue *= 10;
	        }

	        return reversedNum;
	    }
	public static void main(String[] args) {
		 int num = 12345;
	        int reversedNum = reverseNumber(num);
	        System.out.println("Original number: " + num);
	        System.out.println("Reversed number: " + reversedNum);
	}

}
