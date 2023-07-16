
public class Ques6 {
	public static boolean canShift(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String doubledS = s + s;
        return doubledS.contains(goal);
    }

	public static void main(String[] args) {
		String s = "abcde";
        String goal = "cdeab";
        System.out.println(canShift(s, goal)); // Output: true
	}

}
