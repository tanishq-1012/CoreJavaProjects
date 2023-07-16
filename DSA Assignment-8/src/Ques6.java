import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Ques6 {
	 public List<Integer> findAnagrams(String s, String p) {
	        List<Integer> result = new ArrayList<>();
	        if (s.length() < p.length()) {
	            return result;
	        }

	        Map<Character, Integer> pFreqMap = new HashMap<>();
	        Map<Character, Integer> windowFreqMap = new HashMap<>();

	        for (char ch : p.toCharArray()) {
	            pFreqMap.put(ch, pFreqMap.getOrDefault(ch, 0) + 1);
	        }

	        int left = 0, right = 0;
	        int windowSize = p.length();

	        while (right < s.length()) {
	            char rightChar = s.charAt(right);
	            windowFreqMap.put(rightChar, windowFreqMap.getOrDefault(rightChar, 0) + 1);

	            if (right - left + 1 == windowSize) {
	                if (windowFreqMap.equals(pFreqMap)) {
	                    result.add(left);
	                }

	                char leftChar = s.charAt(left);
	                windowFreqMap.put(leftChar, windowFreqMap.get(leftChar) - 1);
	                if (windowFreqMap.get(leftChar) == 0) {
	                    windowFreqMap.remove(leftChar);
	                }

	                left++;
	            }

	            right++;
	        }

	        return result;
	    }
	public static void main(String[] args) {
		Ques6 solution = new Ques6();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indices = solution.findAnagrams(s, p);
        System.out.println(indices); // Output: [0, 6]
	}

}
