class ListNode4 {
    int val;
    ListNode next;
    ListNode4(int val) { this.val = val; }
}

public class Ques5 {
	public static ListNode detectAndRemoveLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Detect the loop using Floyd's Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Loop detected
                break;
            }
        }

        // No loop found
        if (fast == null || fast.next == null) {
            return head;
        }

        // Find the starting node of the loop
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the loop by breaking the link
        ListNode loopStart = slow;
        while (fast.next != loopStart) {
            fast = fast.next;
        }
        fast.next = null;

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
		 ListNode head1 = new ListNode(1);
	        head1.next = new ListNode(3);
	        head1.next.next = new ListNode(4);
	        head1.next.next.next = head1.next; // Loop at node with value 3

	        ListNode result1 = detectAndRemoveLoop(head1);
	        printLinkedList(result1); // Output: 1 3 4

	        ListNode head2 = new ListNode(1);
	        head2.next = new ListNode(8);
	        head2.next.next = new ListNode(3);
	        head2.next.next.next = new ListNode(4);

	        ListNode result2 = detectAndRemoveLoop(head2);
	        printLinkedList(result2); // Output: 1 8 3 4

	}

}
