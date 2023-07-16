import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
public class Ques6 {
	public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> deque = new LinkedList<>();
        for (int i = deck.length - 1; i >= 0; i--) {
            if (!deque.isEmpty()) {
                deque.addFirst(deque.removeLast());
            }
            deque.addFirst(deck[i]);
        }
        int[] result = new int[deck.length];
        int i = 0;
        while (!deque.isEmpty()) {
            result[i++] = deque.removeFirst();
        }
        return result;
    }
	public static void main(String[] args) {
		 Ques6 cardRevealOrder = new Ques6();
	        int[] deck = {17, 13, 11, 2, 3, 5, 7};
	        int[] result = cardRevealOrder.deckRevealedIncreasing(deck);
	        System.out.println(Arrays.toString(result)); // Output: [2, 13, 3, 11, 5, 17, 7]
	}

}
