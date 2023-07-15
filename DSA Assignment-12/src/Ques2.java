class ListNode1 {
    int val;
    ListNode next;
    ListNode1(int val) { this.val = val; }
}
public class Ques2 {
	public static boolean hasLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Loop detected
                return true;
            }
        }

        // No loop found
        return false;
    }
	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(4);
        head1.next.next.next = head1.next; // Loop at node with value 3

        System.out.println(hasLoop(head1)); // Output: true

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);

        System.out.println(hasLoop(head2)); // Output: false
	}

}
