import java.util.HashMap;
public class Ques1 {
	 public int romanToInt(String s) {
	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);

	        int result = 0;
	        int n = s.length();

	        for (int i = 0; i < n; i++) {
	            int currentValue = romanMap.get(s.charAt(i));
	            if (i < n - 1 && currentValue < romanMap.get(s.charAt(i + 1))) {
	                result -= currentValue;
	            } else {
	                result += currentValue;
	            }
	        }

	        return result;
	    }
	public static void main(String[] args) {
		Ques1 solution = new Ques1();

        // Example
        String romanNumeral = "III";
        int intValue = solution.romanToInt(romanNumeral);
        System.out.println(intValue); // Output: 3
	}

}
