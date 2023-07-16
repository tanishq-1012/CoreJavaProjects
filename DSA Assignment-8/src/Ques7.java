import java.util.Stack;
public class Ques7 {
	public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        int k = 0;
        String result = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(k);
                resultStack.push(result);
                k = 0;
                result = "";
            } else if (c == ']') {
                StringBuilder sb = new StringBuilder(resultStack.pop());
                int repeatCount = countStack.pop();
                for (int i = 0; i < repeatCount; i++) {
                    sb.append(result);
                }
                result = sb.toString();
            } else {
                result += c;
            }
        }

        return result;
    }
	public static void main(String[] args) {
		 Ques7 solution = new Ques7();
	        String s = "3[a]2[bc]";
	        String decoded = solution.decodeString(s);
	        System.out.println(decoded); // Output: "aaabcbc"
	}

}
