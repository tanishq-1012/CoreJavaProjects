//Generics demonstration 
import java.util.ArrayList;
import java.util.Iterator;
public class Launch1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Integer i3 = al.get(3);
		System.out.println(i3);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			Integer i1 = (Integer) i.next();
			System.out.println(i1);
			
		}

	}

}
