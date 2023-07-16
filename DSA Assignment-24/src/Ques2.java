import java.util.HashSet;
public class Ques2 {
	public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        HashSet<Character> characters = new HashSet<>();

        while (right < n) {
            if (!characters.contains(s.charAt(right))) {
                characters.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                characters.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
	public static void main(String[] args) {
		Ques2 solution = new Ques2();

        // Example
        String s = "abcabcbb";
        int maxLength = solution.lengthOfLongestSubstring(s);
        System.out.println(maxLength); // Output: 3
	}

}
