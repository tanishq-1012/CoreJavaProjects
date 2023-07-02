//ArrayDeque Demonstration 
import java.util.ArrayDeque;

public class LaunchAD1 {

	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(40);
		
		//ArrayDeque is a type of data structure which internally follows doubly ended queue.
		//Therefore in arrayDeque index based accessing is not allowed.
		
		System.out.println(ad);
		
		//adding element at first position
		ad.addFirst(5);
		
		//Adding element at last position
		ad.addLast(35);
		System.out.println(ad);

	}

}
