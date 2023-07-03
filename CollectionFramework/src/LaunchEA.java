//Demonstration of accessing elements
import java.util.*;
public class LaunchEA {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		System.out.println("*******************");
		//Different ways of accessing data present within collection.
		
		//1. Normal loop
		
		for(int i= 0; i<a.size(); i++) {
			//Object o = a.get(i);
			//System.out.println(o);
			System.out.println(a.get(i));
		}
		
		//2. For Each loop
		System.out.println("*******************");
		for(Object o: a)
		{
			System.out.println(o);
		}
		//Index based accessing is only allowed in list based collection.
		//To resolve this problem we use iterator.
		
		//3. Iterator
		System.out.println("*******************");
		Iterator i = a.iterator();
		
		while(i.hasNext()) {
			//Integer i1 = (Integer) i.next();
			//Object o = i.next();
			
			System.out.println(i.next());
			
		}
		
		//Reverse Iteration - reverse iteration is not possible in all the collection classes.
		// it is only present in two classes which are arraylist and linkedlist.
		System.out.println("*******************");
		ListIterator l = a.listIterator(a.size());
		
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
				
		
		
		}

}
