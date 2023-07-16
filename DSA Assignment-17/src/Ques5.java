class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
public class Ques5 {
	public int findTheWinner(int n, int k) {
        ListNode head = createCircularLinkedList(n);
        while (head.next != head) {
            ListNode prev = findPreviousNode(head, k);
            prev.next = prev.next.next;
            head = prev.next;
        }
        return head.val;
    }

    private ListNode createCircularLinkedList(int n) {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= n; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        current.next = head;
        return head;
    }

    private ListNode findPreviousNode(ListNode head, int k) {
        ListNode prev = null;
        for (int i = 0; i < k; i++) {
            prev = head;
            head = head.next;
        }
        return prev;
    }
	public static void main(String[] args) {
		 Ques5 gameWinner = new Ques5();
	        int n = 5;
	        int k = 2;
	        int winner = gameWinner.findTheWinner(n, k);
	        System.out.println("Winner: " + winner); // Output: 3
	}

}
