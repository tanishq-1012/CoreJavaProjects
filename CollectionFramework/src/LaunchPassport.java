import java.util.*;
import java.util.Map.Entry;

class Information{
	private String name;
	private int age;
	private String fatherName;
	private String city;
	
	public Information(String name, int age, String fatherName, String city) {
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getFatherName() {
		return fatherName;
	}
	
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString()
	{	
		return name + " " + age + " " + fatherName + " " + city;
	}
}

//class key{
//	int key;
//	public key(int key) {
//		this.key = key;
//	}
//}

public class LaunchPassport {

	public static void main(String[] args) {
		Information info1 = new Information("Rohan",18,"xyz","Delhi");
		Information info2 = new Information("Tanishq",24,"Surinder","Delhi");
		Information info3 = new Information("Aniket",18,"krishan","Delhi");
		
		HashMap hm = new HashMap();
		
		hm.put(000,info1);
		hm.put(111,info2);
		hm.put(222,info3);
		
		Set set = hm.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry passport = (Entry) it.next();
			System.out.println("Passport Number : "+passport.getKey() + " : Info : "+ passport.getValue());
		}
		
	}

}
