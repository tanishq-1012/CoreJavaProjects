class ListNode2 {
    int val;
    ListNode next;
    ListNode2(int val) { this.val = val; }
}
public class Ques3 {
	 public static int findNthFromEnd(ListNode head, int n) {
	        ListNode first = head;
	        ListNode second = head;

	        // Move first pointer N steps ahead
	        for (int i = 0; i < n; i++) {
	            if (first == null) {
	                // Handle the case where N is greater than the number of nodes
	                return -1;
	            }
	            first = first.next;
	        }

	        // Move both pointers until the first pointer reaches the end
	        while (first != null) {
	            first = first.next;
	            second = second.next;
	        }

	        // The second pointer is pointing to the Nth node from the end
	        return second.val;
	    }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;
        System.out.println(findNthFromEnd(head, n)); // Output: 4
	}

}
