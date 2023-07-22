import java.util.Scanner;
class UnderAgeException extends Exception{
	public UnderAgeException(String message) {
		super(message);
	}
}
class OverAgeException extends Exception{
	public OverAgeException(String message) {
		super(message);
	}
}
class Apply{
	int age;
	String name;
	
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter your Name");
		name = s.nextLine();
		
		System.out.println("Please Enter your age");
		age = s.nextInt();
		
	}
	public void verify() throws UnderAgeException , OverAgeException {
		if(age < 18) {
			UnderAgeException u = new UnderAgeException("Sorry but you are under age.......");
			System.out.println(u.getMessage());
			throw u;
			
		}
		else if(age > 60) {
			OverAgeException o = new OverAgeException("Sorry but you are old now........");
			System.out.println(o.getMessage());
			throw o;
		}
		else {
			System.out.println("You are good to go!");
		}
	}
	
	
}
class Rto{
	public void initiate() {
		Apply a = new Apply();
	try {
		a.input();
		a.verify();
		}
		catch(UnderAgeException | OverAgeException e) {
			try {
				a.input();
				a.verify();
			}
			catch(UnderAgeException | OverAgeException e1) {
				System.out.println("Don't Try Again & Again");
				System.exit(0);
			}
		}
	}
}
public class LaunchAto {

	public static void main(String[] args) {
		
		Rto r = new Rto();
		r.initiate();

	}

}
