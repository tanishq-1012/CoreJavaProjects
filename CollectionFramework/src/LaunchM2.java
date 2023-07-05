import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

class Student {
	private String name;
	private int age;
	private String city;
	
	Student(String name, int age, String city){
		this.name = name;
		this.age = age;
		this.city = city;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return name + " " + age + " " + city;
	}
	
}
public class LaunchM2 {

	public static void main(String[] args) {
		Student st1 =new Student("Rohan",18,"Mumbai");
		Student st2 =new Student("Rahul",18,"Bengaluru");
		Student st3 =new Student("Rohan",18,"Delhi");
		
		HashMap hm = new HashMap();
		hm.put(1,st1);
		hm.put(2,st2);
		hm.put(3,st3);
		
		System.out.println(hm);
		System.out.println("*********************************");
		
		Collection c = hm.values();
		Iterator i1 = c.iterator();
		
		while(i1.hasNext()) {
			System.out.println("Values of Students :: "+ i1.next());
		}
		System.out.println("*********************************");
		
		Set s = hm.keySet();
		Iterator i2 = s.iterator();
		
		while(i2.hasNext()) {
			System.out.println("Keys of Students :: "+i2.next());
		}
		System.out.println("*********************************");
		
		Set s2 = hm.entrySet();
		Iterator i3 = s2.iterator();
		while(i3.hasNext()) {
			Map.Entry me = (Entry) i3.next();
			System.out.println(me.getKey() + " :: "+me.getValue());
		}

	}

}
