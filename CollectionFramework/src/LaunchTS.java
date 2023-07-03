//Demonstration of treeset
import java.util.*;
public class LaunchTS {

	public static void main(String[] args) {
		 TreeSet ts = new TreeSet();
		 ts.add(100);
		 ts.add(50);
		 ts.add(150);
		 ts.add(25);
		 ts.add(75);
		 ts.add(125);
		 ts.add(175);
		 
		 //TreeSet give the output in asscending sorted order
		 System.out.println(ts);
		 //Internally it follows the balanced binary search tree
	}

}
