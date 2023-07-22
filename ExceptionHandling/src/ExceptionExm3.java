import java.util.Scanner;

class Alpha{
	void alpha() throws ArithmeticException
	{
		System.out.println("Connection to calc app is established");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1 = scn.nextInt();
		
		System.out.println("Enter the 2nd number");
		int num2 = scn.nextInt();
		
		int res = num1/num2;
		System.out.println("The result is "+res);
		System.out.println("Connection is terminated");
	}
	
}
class Beta{
	void beta() throws ArithmeticException {
		Alpha a = new Alpha();
		a.alpha();
	}
}

public class ExceptionExm3 {

	public static void main(String[] args) {
		try {
			
			Beta b = new Beta();
			b.beta();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception finally handled in main");
			
			 String s = "abcd";
			    System.out.print(s.charAt(0));
		}
		
	}

}
