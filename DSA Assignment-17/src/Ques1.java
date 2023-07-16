import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
public class Ques1 {
	public int firstUniqChar(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        Queue<Character> seenQueue = new LinkedList<>();
        Queue<Character> uniqueQueue = new LinkedList<>();

        // Count the frequency of each character and add them to the queues
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            seenQueue.offer(c);
            if (frequencyMap.get(c) == 1) {
                uniqueQueue.offer(c);
            }
        }

        // Find the first non-repeating character
        while (!uniqueQueue.isEmpty()) {
            char current = uniqueQueue.peek();
            if (frequencyMap.get(current) == 1) {
                return s.indexOf(current);
            } else {
                uniqueQueue.poll();
            }
        }

        return -1; // No non-repeating character found
    }
	public static void main(String[] args) {
		 Ques1 solution = new Ques1();

	        // Examples
	        String s1 = "leetcode";
	        System.out.println(solution.firstUniqChar(s1)); // Output: 0

	        String s2 = "loveleetcode";
	        System.out.println(solution.firstUniqChar(s2)); // Output: 2
	}

}
