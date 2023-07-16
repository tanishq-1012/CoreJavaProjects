
public class Ques8 {
	public boolean canSwap(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        int count = 0;
        int index1 = -1, index2 = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
                if (count == 1) {
                    index1 = i;
                } else if (count == 2) {
                    index2 = i;
                }
            }
        }

        if (count == 2) {
            return s.charAt(index1) == goal.charAt(index2) && s.charAt(index2) == goal.charAt(index1);
        }

        return false;
    }

	public static void main(String[] args) {
		 Ques8 solution = new Ques8();
	        String s = "ab";
	        String goal = "ba";
	        boolean result = solution.canSwap(s, goal);
	        System.out.println(result); // Output: true
	}

}
