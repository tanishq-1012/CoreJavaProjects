import java.util.*;
public class Ques6 {
	public List<String> topKFrequent(String[] words, int k) {
        // Count the frequency of each word using a HashMap
        Map<String, Integer> wordFreqMap = new HashMap<>();
        for (String word : words) {
            wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
        }

        // Create a PriorityQueue to keep track of the k most frequent words
        PriorityQueue<String> pq = new PriorityQueue<>(
                (word1, word2) -> wordFreqMap.get(word1).equals(wordFreqMap.get(word2))
                        ? word2.compareTo(word1)
                        : wordFreqMap.get(word1) - wordFreqMap.get(word2));

        // Add words to the PriorityQueue
        for (String word : wordFreqMap.keySet()) {
            pq.offer(word);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Build the result list in reverse order from the PriorityQueue
        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(0, pq.poll());
        }

        return result;
    }
	public static void main(String[] args) {
		Ques6 solution = new Ques6();

        // Example
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> topKFrequentWords = solution.topKFrequent(words, k);
        System.out.println(topKFrequentWords);
        // Output: ["i","love"]
	}

}
