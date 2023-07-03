//Demonstration of Hash set
import java.util.*;
public class LaunchHS {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		System.out.println("HashSet ::");
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		//In hash set order of insertion is not preserve.
		//Also in hash set index based accessing is not allowed.
		System.out.println(hs);
		
		System.out.println();
		
		//To resolve this problem of preservation of order we use Linked hash set.
		LinkedHashSet l = new LinkedHashSet();
		System.out.println("LinkedHashSet::");
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println(l);
		
	}

}
