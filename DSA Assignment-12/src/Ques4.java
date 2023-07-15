class ListNode3 {
    char val;
    ListNode next;
    ListNode3(char val) { this.val = val; }
}
public class Ques4 {
	 public static boolean isPalindrome(ListNode head) {
	        if (head == null || head.next == null) {
	            // An empty list or a list with a single node is a palindrome
	            return true;
	        }

	        // Step 1: Find the middle of the linked list
	        ListNode slow = head;
	        ListNode fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        // Step 2: Reverse the second half of the linked list
	        ListNode reversedSecondHalf = reverseLinkedList(slow);

	        // Step 3: Compare the first half with the reversed second half
	        ListNode current = head;
	        while (reversedSecondHalf != null) {
	            if (current.val != reversedSecondHalf.val) {
	                return false;
	            }
	            current = current.next;
	            reversedSecondHalf = reversedSecondHalf.next;
	        }

	        return true;
	    }

	    public static ListNode reverseLinkedList(ListNode head) {
	        ListNode prev = null;
	        while (head != null) {
	            ListNode next = head.next;
	            head.next = prev;
	            prev = head;
	            head = next;
	        }
	        return prev;
	    }
	public static void main(String[] args) {
		ListNode head1 = new ListNode('R');
        head1.next = new ListNode('A');
        head1.next.next = new ListNode('D');
        head1.next.next.next = new ListNode('A');
        head1.next.next.next.next = new ListNode('R');

        System.out.println(isPalindrome(head1)); // Output: true

        ListNode head2 = new ListNode('C');
        head2.next = new ListNode('O');
        head2.next.next = new ListNode('D');
        head2.next.next.next = new ListNode('E');

        System.out.println(isPalindrome(head2)); // Output: false
	}

}
