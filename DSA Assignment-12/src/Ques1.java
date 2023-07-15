class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
public class Ques1 {
	public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            // Empty list or single node, return null
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move fast pointer twice as fast as slow pointer
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Remove the middle node(s)
        if (prev != null) {
            prev.next = slow.next;
        } else {
            // If prev is null, the list has only two nodes
            return head.next;
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
		ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode result1 = deleteMiddle(head1);
        printLinkedList(result1); // Output: 1 2 4 5

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);

        ListNode result2 = deleteMiddle(head2);
        printLinkedList(result2); // Output: 1 2 3 5 6
	}

}
