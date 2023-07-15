class ListNode5 {
    int val;
    ListNode next;
    ListNode5(int val) { this.val = val; }
}

public class Ques6 {
	public static ListNode skipMDeleteN(ListNode head, int M, int N) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            int countM = 0;
            int countN = 0;

            // Traverse M nodes
            while (current != null && countM < M) {
                prev = current;
                current = current.next;
                countM++;
            }

            // Delete N nodes
            while (current != null && countN < N) {
                current = current.next;
                countN++;
            }

            // Skip the deleted N nodes by updating the 'next' pointer of the previous node
            prev.next = current;
        }

        return head;
    }
	 public static void printLinkedList(ListNode head) {
	        ListNode current = head;
	        while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        int M = 2;
        int N = 3;

        ListNode result = skipMDeleteN(head, M, N);
        printLinkedList(result); // Output: 1 2 6 7
	}

}
