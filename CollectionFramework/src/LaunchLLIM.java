//Linked List inbuilt methods demonstration
import java.util.LinkedList;

public class LaunchLLIM {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(40);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		System.out.println(ll);
		
		//getFirst() it will return first element of linked list
		System.out.println(ll.getFirst());
		
		//getLast() it will return last element of the linked list
		System.out.println(ll.getLast());
		
		//indexOf() it will give first index of element
		System.out.println(ll.indexOf(40));
		
		//lastIndexOf it will give last index of element
		System.out.println(ll.lastIndexOf(40));
		
		//addFirst() & addLast()
		ll.addFirst(5);
		ll.addLast(55);
		System.out.println(ll);

	}

}
