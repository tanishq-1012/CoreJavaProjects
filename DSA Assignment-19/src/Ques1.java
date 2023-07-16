import java.util.PriorityQueue;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class Ques1 {
	 public ListNode mergeKLists(ListNode[] lists) {
	        if (lists == null || lists.length == 0) {
	            return null;
	        }

	        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

	        for (ListNode head : lists) {
	            if (head != null) {
	                minHeap.add(head);
	            }
	        }

	        ListNode dummy = new ListNode(-1);
	        ListNode current = dummy;

	        while (!minHeap.isEmpty()) {
	            ListNode minNode = minHeap.poll();
	            current.next = minNode;
	            current = current.next;

	            if (minNode.next != null) {
	                minHeap.add(minNode.next);
	            }
	        }

	        return dummy.next;
	    }
	 private static void printList(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val + "->");
	            head = head.next;
	        }
	        System.out.println("null");
	    }
	public static void main(String[] args) {
		 Ques1 solution = new Ques1();

	        // Example 1
	        ListNode[] lists1 = new ListNode[]{
	                new ListNode(1, new ListNode(4, new ListNode(5))),
	                new ListNode(1, new ListNode(3, new ListNode(4))),
	                new ListNode(2, new ListNode(6))
	        };
	        ListNode mergedList1 = solution.mergeKLists(lists1);
	        printList(mergedList1); // Output: 1->1->2->3->4->4->5->6

	        // Example 2
	        ListNode[] lists2 = new ListNode[]{};
	        ListNode mergedList2 = solution.mergeKLists(lists2);
	        printList(mergedList2); // Output: null

	        // Example 3
	        ListNode[] lists3 = new ListNode[]{null};
	        ListNode mergedList3 = solution.mergeKLists(lists3);
	        printList(mergedList3); // Output: null
	}

}
