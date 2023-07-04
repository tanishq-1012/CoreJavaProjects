//Demonstration of Maps -> HashMap, LinkedHashMap
import java.util.*;
public class LaunchMap {

	public static void main(String[] args) {
		
		//The order will not be preserved by using HashMap
		HashMap hm = new HashMap();
		hm.put(10,"Sachin");
		hm.put(7,"MSD");
		hm.put(18,"Kholi");
		System.out.println(hm);
		System.out.println("****************************");
		
		//To resolve this problem we can use LinkedHashMap
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(10,"Sachin");
		lhm.put(7,"MSD");
		lhm.put(18,"Kholi");
		System.out.println(lhm);
	}

}
