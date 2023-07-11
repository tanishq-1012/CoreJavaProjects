//Comparator
import java.util.*;
class MyComparator implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2 ) {
		System.out.println("compare() called");
		
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		
		if(i1<i2) {
			return +1;
		}
		else if(i1>i2) {
			return -1;
		}else {
			return 0;
		}
	}
}
public class LaunchCC {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());
		
		ts.add(10);
		ts.add(0);
		ts.add(80);
		ts.add(4);
		ts.add(16);
		ts.add(92);
		ts.add(1);
		
		System.out.println(ts);
		
	}

}
