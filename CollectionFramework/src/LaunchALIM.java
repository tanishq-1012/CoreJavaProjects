// ArrayList Inbuilt Method Demonstration
import java.util.ArrayList;
public class LaunchALIM {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		System.out.println(al);
		
		//contains()
		System.out.println(al.contains(44));
		
		//indexOf()
		int index = al.indexOf(22);
		System.out.println(index);
		
		//isEmpty()
		System.out.println(al.isEmpty())
;
		//ensureCapacity() it ensures the capacity of the array list.
		al.ensureCapacity(10);
		
		//size() it tells the size of the array list
		System.out.println(al.size());
		
		//trimtoSize() it will trim the unused capacity
		al.trimToSize();
		
		//getClass()
		System.out.println(al.getClass());
		
		System.out.println(al);
		System.out.println(al.size());
		
	}

}
