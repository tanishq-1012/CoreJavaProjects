//LinkedList Demonstration
import java.util.LinkedList;
import java.util.*;
public class LaunchLL1 {

	public static void main(String[] args) {
		LinkedList ll1 = new LinkedList();
		ll1.add(10);
		ll1.add("iNeuron");
		ll1.add(20);
		
		System.out.println(ll1);
		
		ll1.addFirst("Tanishq");
		
		System.out.println(ll1);
		
		ll1.add(3,"Delhi");
		
		System.out.println(ll1);
		
		ll1.addLast("Rampura");
		
		System.out.println(ll1);

	}

}
