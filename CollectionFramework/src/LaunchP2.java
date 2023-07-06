import java.util.*;
import java.util.Map.Entry;

class Information1{
	private String name;
	private int age;
	private String fatherName;
	private String city;
	
	public Information1(String name, int age, String fatherName, String city) {
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

public class LaunchP2 {

	public static void main(String[] args) {
		Information1 info1 = new Information1("Rohan",18,"xyz","Delhi");
		Information1 info2 = new Information1("Tanishq",24,"Surinder","Delhi");
		Information1 info3 = new Information1("Aniket",18,"krishan","Delhi");
		
		HashMap hm = new HashMap();
		
		hm.put(000,info1);
		hm.put(111,info2);
		hm.put(222,info3);
		
		System.out.println("Welcome to passport details");
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the passport number");
		Integer k = s.nextInt();
		
		boolean flag = false;
		
		Set set = hm.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry passport = (Entry) it.next();
			//System.out.println("Passport Number : "+passport.getKey() + " : Info : "+ passport.getValue());
			Integer key = (Integer) passport.getKey();
			
			if(k==key) {
				System.out.println(" Info :" + passport.getValue());
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("Passport number not found");
		}
	}

}
